/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.services;

import ao.library.dtos.BookRequest;
import ao.library.dtos.BookResponse;
import ao.library.entities.Author;
import ao.library.entities.Book;
import ao.library.entities.Publisher;
import ao.library.exceptions.DuplicateEntryException;
import ao.library.exceptions.InvalidArgumentException;
import ao.library.exceptions.ResourceNotFoundException;
import ao.library.mappers.BookMapper;
import ao.library.repositories.AuthorRepository;
import ao.library.repositories.BookRepository;
import ao.library.repositories.PublisherRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crisb
 */
@Service
public class BookService
{

    @Autowired
    private BookRepository repository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookMapper bookMapper;

    @Transactional
    public BookResponse createBook(BookRequest request)
    {
        // If ISBN already exists
        if (repository.existsByIsbn(request.getIsbn()))
        {
            throw new DuplicateEntryException("ISBN already exists");
        }

        // Validate if title is not empty
        if (request.getTitle() == null || request.getTitle().isBlank())
        {
            throw new InvalidArgumentException("Book's title is required");
        }

        // Validate if there's at least one associated author
        if (request.getAuthorsIds() == null || request.getAuthorsIds().isEmpty())
        {
            throw new InvalidArgumentException("It's required to associate at least one author to the book");
        }

        // Fetch authors by supplied IDs
        List<Author> authors = authorRepository.findAllById(request.getAuthorsIds());

        // Validate if all authors were found
        if (authors.size() != request.getAuthorsIds().size())
        {
            throw new InvalidArgumentException("One or more supplied authors were not found");
        }

        // Create book and associate repsective authors
        Book book = bookMapper.toEntity(request);
        book.setAuthors(authors);
        // If a Publisher ID was provided
        if (request.getPublisherId() != null || !request.getPublisherId().toString().isEmpty())
        {
            // Fetch and validate if Publisher exists
            Publisher publisher = publisherRepository.findById(request.getPublisherId())
                    .orElseThrow(() -> new ResourceNotFoundException("Publisher not found with id " + request.getPublisherId()));
            book.setPublisher(publisher);
        }

        Book createdBook = repository.save(book);
        return bookMapper.toDto(createdBook);
    }

    @Transactional(readOnly = true)
    public List<BookResponse> getBooks()
    {
        return repository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    public Page<BookResponse> getBooksPaginated(int pageNumber, int pageSize, String sortOrder)
    {
        int pageIndex = Math.max(pageNumber - 1, 0);
        Pageable pageable = PageRequest.of(pageIndex, pageSize, Sort.by(sortOrder).ascending());
        Page<Book> booksPage = repository.findAll(pageable);
        return booksPage.map(bookMapper::toDto);
    }

    @Transactional(readOnly = true)
    public BookResponse getBookById(UUID id)
    {
        Book book = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
        return bookMapper.toDto(book);
    }
}
