package com.Library.OnlineLibrary.infrastructure.abstract_services;

public interface CrudService<DTO, TYPE> {

    DTO getById(TYPE id);

    DTO create(DTO request);

    DTO update(DTO request, TYPE id);

    void delete(TYPE id);

}