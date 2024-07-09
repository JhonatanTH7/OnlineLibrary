package com.Library.OnlineLibrary.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Library.OnlineLibrary.domain.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
