/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.mappers;

import ao.library.dtos.AuthorRequest;
import ao.library.dtos.AuthorResponse;
import ao.library.entities.Author;
import org.springframework.stereotype.Component;

/**
 *
 * @author crisb
 */
@Component
public class AuthorMapper
{
    public Author toEntity(AuthorRequest dto)
    {
        Author author = new Author();
        author.setName(dto.getName());
        return author;
    }
    
    public AuthorResponse toDto(Author author)
    {
        return new AuthorResponse(
                author.getId(),
                author.getName(),
                author.getCreatedAt(),
                author.getUpdatedAt()
        );
    }
    
    public void updateEntityFromDto(AuthorRequest dto, Author author)
    {
        author.setName(dto.getName());
    }
}
