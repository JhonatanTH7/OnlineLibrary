package com.Library.OnlineLibrary.api.dto;

import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetReservation {

    private Long id;
    private Date reservationDate;
    private String status;
    private User user;
    private Book book;

}
