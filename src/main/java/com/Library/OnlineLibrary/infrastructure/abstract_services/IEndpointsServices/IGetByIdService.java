package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

public interface IGetByIdService<RESPONSE, TYPE> {
    RESPONSE findById(TYPE id);
}
