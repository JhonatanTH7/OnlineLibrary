package com.Library.OnlineLibrary.infrastructure.services;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IBookService;

@Service
public class BookService implements IBookService {

    @Override
    public BookBasicResponse create(BookRequest request) {
        return null;
    }

    @Override
    public BookResponse findById(Long id) {
        return null;
    }

    @Override
    public BookBasicResponse update(BookRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<BookBasicResponse> getAll(int page, int size) {
        return null;
    }

}
