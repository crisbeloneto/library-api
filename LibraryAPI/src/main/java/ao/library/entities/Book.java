/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.time.LocalDateTime;
import java.util.List;
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

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;
    
    @ManyToOne
    @JoinColumn(name = "fk_publisher", foreignKey = @ForeignKey(name = "publisher_fkey"))
    private Publisher publisher;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "fk_book", foreignKey = @ForeignKey(name = "book_fkey")),
            inverseJoinColumns = @JoinColumn(name = "fk_author", foreignKey = @ForeignKey(name = "author_fkey")))
    private List<Author> authors;

    @PrePersist
    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate()
    {
        updatedAt = LocalDateTime.now();
    }
}
