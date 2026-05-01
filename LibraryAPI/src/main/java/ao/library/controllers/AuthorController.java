/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.controllers;

import ao.library.dtos.AuthorResponse;
import ao.library.services.AuthorService;
import ao.library.utils.Constantes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crisb
 */
@RestController
@RequestMapping(Constantes.ROOT_ROUTE + "/author")
public class AuthorController
{    
    @Autowired
    private AuthorService service;
    
    /**
     * Goal : Retrieve all the authors
     * @return : List of all existing authors
     */
    @GetMapping
    public ResponseEntity<List<AuthorResponse>> getAuthors()
    {
        List<AuthorResponse> authors = service.getAuthors();
        return ResponseEntity.ok(authors);
    }
}
