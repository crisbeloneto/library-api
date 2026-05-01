/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.services;

import ao.library.dtos.AuthorResponse;
import ao.library.mappers.AuthorMapper;
import ao.library.repositories.AuthorRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
