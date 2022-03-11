package com.vmuller.photo.api.users.services;

import com.vmuller.photo.api.users.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
