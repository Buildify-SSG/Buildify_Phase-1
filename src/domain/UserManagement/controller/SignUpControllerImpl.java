package domain.UserManagement.controller;

import common.ValidCheck;
import domain.UserManagement.service.LoginService;
import domain.UserManagement.service.SignUpService;
import dto.AdminDto;

public class SignUpControllerImpl {
    private final ValidCheck validCheck;
    private final SignUpService signUpService;

    public SignUpControllerImpl(ValidCheck validCheck, SignUpService signUpService) {
        this.validCheck = validCheck;
        this.signUpService = signUpService;
    }
}
