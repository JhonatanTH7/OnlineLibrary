package com.Library.OnlineLibrary.infrastructure.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.User;
import com.Library.OnlineLibrary.domain.repositories.LoanRepository;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IBookService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.ILoanService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IUserService;
import com.Library.OnlineLibrary.infrastructure.helpers.mappers.LoanMapper;
import com.Library.OnlineLibrary.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanService implements ILoanService {

    @Autowired
    private final LoanRepository loanRepository;

    @Autowired
    private final LoanMapper loanMapper;

    @Autowired
    private final IUserService userService;

    @Autowired
    private final IBookService bookService;

    @Override
    public LoanResponse create(LoanRequest request) {
        Loan loan = this.loanMapper.toEntity(request);

        User oldUser = this.userService.find(request.getUserId());
        Book oldBook = this.bookService.find(request.getBookId());

        loan.setUser(oldUser);
        loan.setBook(oldBook);

        return this.loanMapper.toEntityResponse(this.loanRepository.save(loan));
    }

    @Override
    public LoanResponse getById(Long id) {
        return this.loanMapper.toEntityResponse(this.find(id));
    }

    @Override
    public LoanResponse update(LoanRequest request, Long id) {
        Loan oldLoan = this.find(id);
        User oldUser = this.userService.find(request.getUserId());
        Book oldBook = this.bookService.find(request.getBookId());

        oldLoan.setUser(oldUser);
        oldLoan.setBook(oldBook);

        return this.loanMapper.toEntityResponse(this.loanRepository.save(oldLoan));
    }

    @Override
    public void delete(Long id) {
        this.loanRepository.delete(this.find(id));
    }

    @Override
    public List<LoanResponse> getAllByUser(Long idUser) {
        return null;
    }

    public Loan find(Long id) {
        return this.loanRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No loans found with the id: " + id));
    }

}
