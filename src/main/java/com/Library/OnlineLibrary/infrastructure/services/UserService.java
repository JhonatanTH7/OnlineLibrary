package com.Library.OnlineLibrary.infrastructure.services;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IUserService;

@Service
public class UserService implements IUserService {

    @Override
    public UserBasicResponse create(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse getById(Long id) {
        return null;
    }

    @Override
    public UserBasicResponse update(UserRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
