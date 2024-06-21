package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetBook;
import com.Library.OnlineLibrary.domain.entities.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {

    GetBook toGetDTO(Book book);

    @InheritInverseConfiguration
    Book toEntity(GetBook getBook);

}
