package com.Library.OnlineLibrary.infrastructure.services;

import com.Library.OnlineLibrary.api.dto.GetBook;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Override
    public List<GetBook> getAll() {
        return List.of();
    }

    @Override
    public GetBook getById(Long id) {
        return null;
    }

    @Override
    public GetBook create(GetBook request) {
        return null;
    }

    @Override
    public GetBook update(GetBook request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
