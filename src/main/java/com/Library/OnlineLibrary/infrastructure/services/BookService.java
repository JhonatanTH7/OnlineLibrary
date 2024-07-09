package com.Library.OnlineLibrary.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.repositories.BookRepository;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IBookService;
import com.Library.OnlineLibrary.infrastructure.helpers.mappers.BookMapper;
import com.Library.OnlineLibrary.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService implements IBookService {

    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    private final BookMapper bookMapper;

    @Override
    public BookBasicResponse create(BookRequest request) {
        Book book = this.bookMapper.toEntity(request);
        return this.bookMapper.toEntityBasicResponse(this.bookRepository.save(book));
    }

    @Override
    public BookResponse getById(Long id) {
        return this.bookMapper.toEntityResponse(this.find(id));
    }

    @Override
    public BookBasicResponse update(BookRequest request, Long id) {
        Book oldBook = this.find(id);
        this.bookMapper.toExistingEntity(request, oldBook);
        return this.bookMapper.toEntityBasicResponse(this.bookRepository.save(oldBook));
    }

    @Override
    public void delete(Long id) {
        this.bookRepository.delete(find(id));
    }

    @Override
    public Page<BookBasicResponse> getAll(Pageable pageable) {
        Page<Book> bookPage = bookRepository.findAll(pageable);
        return bookPage.map(bookMapper::toEntityBasicResponse);
    }

    public Book find(Long id) {
        return this.bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No books found with the id: " + id));
    }
}
