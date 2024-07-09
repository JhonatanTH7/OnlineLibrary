package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "loans", ignore = true),
            @Mapping(target = "reservations", ignore = true)
    })
    Book toEntity(BookRequest book);

    BookResponse toEntityResponse(Book book);

    BookBasicResponse toEntityBasicResponse(Book book);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "loans", ignore = true),
            @Mapping(target = "reservations", ignore = true)
    })
    void toExistingEntity(BookRequest bookRequest, @MappingTarget Book book);
}
