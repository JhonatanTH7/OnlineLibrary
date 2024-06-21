package com.Library.OnlineLibrary.infrastructure.abstract_services;

import com.Library.OnlineLibrary.api.dto.GetUser;
import org.springframework.stereotype.Service;

@Service
public interface IUserService extends CrudService<GetUser, Long> {
}
