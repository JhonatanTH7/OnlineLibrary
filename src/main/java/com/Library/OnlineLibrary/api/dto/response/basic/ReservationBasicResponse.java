package com.Library.OnlineLibrary.api.dto.response.basic;

import java.util.Date;

import com.Library.OnlineLibrary.util.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationBasicResponse {

    private Long id;
    private Date reservationDate;
    private Status status;

}
