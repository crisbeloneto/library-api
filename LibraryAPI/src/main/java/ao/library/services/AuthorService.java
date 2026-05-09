/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.services;

import ao.library.dtos.AuthorResponse;
import ao.library.entities.Author;
import ao.library.exceptions.InvalidArgumentException;
import ao.library.exceptions.ResourceNotFoundException;
import ao.library.mappers.AuthorMapper;
import ao.library.repositories.AuthorRepository;
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
public class AuthorService
{

    @Autowired
    private AuthorRepository repository;

    @Autowired
    private AuthorMapper authorMapper;

    public List<AuthorResponse> getAuthors()
    {
        return repository.findAll()
                .stream()
                .map(authorMapper::toDto)
                .collect(Collectors.toList());
    }

    public Page<AuthorResponse> getAuthorsPaginated(int pageNumber, int pageSize, String sortOrder)
    {
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortOrder).descending());
        Page<Author> authorsPage = repository.findAll(pageable);
        Page<AuthorResponse> responsePage = authorsPage.map(authorMapper::toDto);
        return responsePage;
    }

    @Transactional(readOnly = true)
    public AuthorResponse getAuthorById(UUID id)
    {
        Author author = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author not found with id: " + id));

        // Validates if an author's name was provided
        if (author.getName() == null || author.getName().isBlank())
        {
            throw new InvalidArgumentException("Author's name is required");
        }
        return authorMapper.toDto(author);
    }
}
