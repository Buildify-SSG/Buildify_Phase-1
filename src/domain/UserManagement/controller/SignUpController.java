package domain.UserManagement.controller;

import dto.UserDto;

public interface SignUpController {

    boolean signUp(UserDto userDto);
}
