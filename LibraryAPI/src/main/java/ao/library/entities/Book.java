/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author CrisbeloNeto
 */
@Entity
@Getter
@Setter
@Table(name = "books", uniqueConstraints =
{
    @UniqueConstraint(name = "isbn_unq", columnNames =
    {
        "isbn"
    })
})
public class Book
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // ISBN is an abbreviation for "International Standard Book Number"
    @Column(length = 30, unique = true, nullable = false)
    private String isbn;
    
    @Column(nullable = false)
    private String title;
    
    private int editionNumber = 0;
    private int copyrightYear;
    private String imageUrl;
}
