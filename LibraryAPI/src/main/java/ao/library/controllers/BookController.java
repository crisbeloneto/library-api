/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.controllers;

import ao.library.dtos.BookRequest;
import ao.library.dtos.BookResponse;
import ao.library.services.BookService;
import ao.library.utils.Constantes;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crisb
 */
@RestController
@RequestMapping(Constantes.ROOT_ROUTE + "/book")
public class BookController
{

    @Autowired
    private BookService service;

    /**
     * Goal: To create a new book
     *
     * @param request : Input data on request body
     * @return : Created book, with appropriate HTTP status (201 CREATED)
     */
    @PostMapping
    public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest request)
    {
        BookResponse response = service.createBook(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /**
     * Goal: Retrieve all the books
     *
     * @return: List of all existing books
     */
    @GetMapping
    public ResponseEntity<List<BookResponse>> getBooks()
    {
        List<BookResponse> books = service.getBooks();
        return ResponseEntity.ok(books);
    }
}
