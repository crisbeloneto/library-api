/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.library.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class BookRequest
{
    @NotBlank(message = "ISBN is required")
    private String isbn;
    
    @NotBlank(message = "Book's title is required")
    private String title;
    
    private int editionNumber;
    private int copyrightYear;
    private UUID publisherId;
    
    @NotEmpty(message = "it's required to associate at least one author to the book")
    private List<UUID> authorsIds;
}
