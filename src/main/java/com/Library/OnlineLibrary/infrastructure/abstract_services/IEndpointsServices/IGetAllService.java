package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

import org.springframework.data.domain.Page;

public interface IGetAllService<RESPONSE> {
    Page<RESPONSE> getAll(int page, int size);
}
