/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.controllers;

import ao.library.dtos.AuthorRequest;
import ao.library.dtos.AuthorResponse;
import ao.library.services.AuthorService;
import ao.library.utils.Constantes;
import jakarta.validation.Valid;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     *
     * @return : List of all existing authors
     */
    @GetMapping
    public ResponseEntity<List<AuthorResponse>> getAuthors()
    {
        List<AuthorResponse> authors = service.getAuthors();
        return ResponseEntity.ok(authors);
    }

    /**
     * Goal: Retrieve a paginated list of all existing authors
     *
     * @param pageNumber : The number of the page in which the listing would
     * start
     * @param pageSize : The amount of items to present
     * @param orderBy : The sorting attribute for the paginated list
     * @return : Paginated list of all existing authors
     */
    @GetMapping("/get-authors-paginated")
    public ResponseEntity<Page<AuthorResponse>> getAuthorsPaginated(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "0") int pageSize,
            @RequestParam(defaultValue = "createdAt") String orderBy)
    {
        return ResponseEntity.ok(service.getAuthorsPaginated(pageNumber, pageSize, orderBy));
    }

    /**
     * Goal : Retrieve a specific author
     *
     * @param id : An author's id
     * @return : Details of the specific author
     */
    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponse> getAuthorById(@PathVariable UUID id)
    {
        AuthorResponse response = service.getAuthorById(id);
        return ResponseEntity.ok(response);
    }
    
    /**
     * Goal : Update info of an existing author
     * 
     * @param id
     * @param request
     * @return : Updated author, with appropriate HTTP status code (200 Ok)
     */
    @PutMapping("/{id}")
    public ResponseEntity<AuthorResponse> update(
            @PathVariable UUID id, @Valid @RequestBody AuthorRequest request)
    {
        AuthorResponse response = service.update(id, request);
        return ResponseEntity.ok(response);
    }
}
