package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

public interface IFindByIdService<RESPONSE, TYPE> {
    RESPONSE findById(TYPE id);
}
