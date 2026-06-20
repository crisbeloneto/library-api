/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.dtos;

import ao.library.entities.Publisher;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author crisb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse
{

    private UUID id;
    private String isbn;
    private String title;
    private int editionNumber;
    private int copyrightYear;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Publisher publisher;
    private List<AuthorResponse> authors;
}
