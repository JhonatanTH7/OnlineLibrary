package com.Library.OnlineLibrary.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.domain.entities.User;
import com.Library.OnlineLibrary.domain.repositories.UserRepository;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IUserService;
import com.Library.OnlineLibrary.infrastructure.helpers.mappers.UserMapper;
import com.Library.OnlineLibrary.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper;

    @Override
    public UserBasicResponse create(UserRequest request) {
        User user = this.userMapper.toEntity(request);
        return this.userMapper.toEntityBasicResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse getById(Long id) {
        return this.userMapper.toEntityResponse(this.find(id));
    }

    @Override
    public UserBasicResponse update(UserRequest request, Long id) {
        User oldUser = this.find(id);
        this.userMapper.toExistingEntity(request, oldUser);
        return this.userMapper.toEntityBasicResponse(this.userRepository.save(oldUser));
    }

    @Override
    public void delete(Long id) {
        this.userRepository.delete(this.find(id));
    }

    @Override
    public User find(Long id) {
        return this.userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No users found with the id: " + id));
    }

}
