package com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.book_reservations.BookReservationsResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IDeleteService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IGetAllService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IUpdateService;

@Service
public interface IBookService extends
                ICreateService<BookRequest, BookBasicResponse>,
                IGetByIdService<BookResponse, Long>,
                IUpdateService<BookRequest, BookBasicResponse, Long>,
                IDeleteService<Long>,
                IGetAllService<BookBasicResponse> {
        Book find(Long id);

        BookReservationsResponse getAllReservationsByBook(Long idBook);
}
