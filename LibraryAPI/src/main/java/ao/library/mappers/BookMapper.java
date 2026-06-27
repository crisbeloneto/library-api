/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.mappers;

import ao.library.dtos.AuthorResponse;
import ao.library.dtos.BookRequest;
import ao.library.dtos.BookResponse;
import ao.library.entities.Book;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author crisb
 */
@Component
public class BookMapper
{

    public Book toEntity(BookRequest dto)
    {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setIsbn(dto.getIsbn());
        book.setEditionNumber(dto.getEditionNumber());
        book.setCopyrightYear(dto.getCopyrightYear());
        return book;
    }

    public BookResponse toDto(Book book)
    {
        return new BookResponse(
                book.getId(),
                book.getIsbn(),
                book.getTitle(),
                book.getEditionNumber(),
                book.getCopyrightYear(),
                book.getCreatedAt(),
                book.getUpdatedAt(),
                book.getPublisher(),
                book.getAuthors() != null ? book.getAuthors().stream()
                .map(author -> new AuthorResponse(
                author.getId(), author.getName(), author.getCreatedAt(), author.getUpdatedAt()))
                .collect(Collectors.toList())
                : null
        );
    }

    public void updateEntityFromDto(BookRequest dto, Book book)
    {
        book.setTitle(dto.getTitle());
    }
}
