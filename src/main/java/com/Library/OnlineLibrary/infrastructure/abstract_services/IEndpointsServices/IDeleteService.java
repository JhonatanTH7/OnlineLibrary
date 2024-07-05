package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

public interface IDeleteService<TYPE> {
    void delete(TYPE id);
}