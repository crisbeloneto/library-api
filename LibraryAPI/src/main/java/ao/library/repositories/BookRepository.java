/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ao.library.repositories;

import ao.library.entities.Book;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crisb
 */
public interface BookRepository extends JpaRepository<Book, UUID>
{

    boolean existsByIsbn(String isbn);
}
