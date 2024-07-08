package com.Library.OnlineLibrary.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @Schema(description = "Title of the Book", example = "Cien años de soledad")
    @NotBlank(message = "The title of the book is required")
    @Size(message = "The title must have a maximum of 100 characters", max = 100)
    private String title;
    @Schema(description = "Author of the Book", example = "Gabriel Garcia Márquez")
    @NotBlank(message = "The author of the book is required")
    @Size(message = "The author must have a maximum of 100 characters", max = 100)
    private String author;
    @Schema(description = "Publication year of the Book", example = "1967")
    @NotNull(message = "The publication year of the book is required")
    private Integer publicationYear;
    @Schema(description = "Genre of the book", example = "Novel, Magical Realism, High Fantasy, Family Saga, Epic Fiction")
    @NotBlank(message = "The genre of the book is required")
    @Size(message = "The genre must have a maximum of 50 characters", max = 50)
    private String genre;
    @Schema(description = "ISBN of the book", example = "9780060114183")
    @NotBlank(message = "The ISBN of the book is required")
    @Size(message = "The ISBN must have a maximum of 20 characters", max = 20)
    private String isbn;

}
