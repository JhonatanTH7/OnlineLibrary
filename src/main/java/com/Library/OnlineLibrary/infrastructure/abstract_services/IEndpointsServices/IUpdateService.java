package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

public interface IUpdateService<REQUEST, RESPONSE, TYPE> {
    RESPONSE update(REQUEST request, TYPE id);
}
