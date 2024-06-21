package com.Library.OnlineLibrary.infrastructure.services;

import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public GetUser getById(Long id) {
        return null;
    }

    @Override
    public GetUser create(GetUser request) {
        return null;
    }

    @Override
    public GetUser update(GetUser request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
