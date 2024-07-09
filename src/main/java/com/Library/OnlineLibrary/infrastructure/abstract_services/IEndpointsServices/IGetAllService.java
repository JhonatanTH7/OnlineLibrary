package com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGetAllService<RESPONSE> {
    Page<RESPONSE> getAll(Pageable pageable);
}
