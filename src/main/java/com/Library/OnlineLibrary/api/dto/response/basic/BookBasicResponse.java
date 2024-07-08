package com.Library.OnlineLibrary.api.dto.response.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBasicResponse {

    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String genre;
    private String isbn;

}
