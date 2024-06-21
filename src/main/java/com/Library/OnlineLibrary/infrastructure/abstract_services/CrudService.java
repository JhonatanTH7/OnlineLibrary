package com.Library.OnlineLibrary.infrastructure.abstract_services;

public interface CrudService<REQUEST, RESPONSE, TYPE> {

    RESPONSE getById(Long id);

    RESPONSE create(REQUEST request);

    RESPONSE update(REQUEST request, TYPE id);

    void delete(TYPE id);

}