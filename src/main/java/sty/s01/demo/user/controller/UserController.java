package sty.s01.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sty.s01.demo.common.RestResponse;
import sty.s01.demo.user.service.UserService;

@RestController
public class UserController {
//    @Autowired
//    private UserService service;
    private  final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public ResponseEntity<RestResponse> login() {
        return null;
    }
}
