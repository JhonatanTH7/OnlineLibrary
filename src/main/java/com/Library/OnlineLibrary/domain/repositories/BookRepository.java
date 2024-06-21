package com.Library.OnlineLibrary.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library.OnlineLibrary.domain.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
