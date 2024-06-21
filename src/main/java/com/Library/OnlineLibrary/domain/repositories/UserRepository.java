package com.Library.OnlineLibrary.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library.OnlineLibrary.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
