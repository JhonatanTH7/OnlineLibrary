package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.domain.entities.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "book.id", source = "bookId"),
            @Mapping(target = "user.id", source = "userId")
    })
    Loan toEntity(LoanRequest loan);

    LoanResponse toEntityResponse(Loan loan);

}
