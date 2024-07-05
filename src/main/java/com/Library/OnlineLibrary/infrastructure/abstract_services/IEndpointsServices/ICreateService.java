package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

public interface ICreateService<REQUEST, RESPONSE> {
    RESPONSE create(REQUEST request);
}
