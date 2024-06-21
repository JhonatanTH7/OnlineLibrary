package com.Library.OnlineLibrary.infrastructure.abstract_services;

import com.Library.OnlineLibrary.api.dto.GetBook;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService extends CrudService<GetBook, Long> {

    List<GetBook> getAll();

}
