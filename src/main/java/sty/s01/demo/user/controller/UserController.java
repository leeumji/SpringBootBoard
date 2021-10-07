package sty.s01.demo.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sty.s01.demo.common.RestResponse;
import sty.s01.demo.user.model.UserInfo;
import sty.s01.demo.user.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class UserController {
//    @Autowired
//    private UserService service;
    private  final UserService service;

    // DI 생성자 주입방식
    public UserController(UserService service) {
        this.service = service;
    }

//    @RequestMapping(value = "", method = {RequestMethod.GET}) 밑에와 동일
    @GetMapping("/user/list")
    public ResponseEntity<RestResponse> callList() {
    //    log.info("uri, url : {}, {}", httpServletRequest.getRequestURI(), httpServletRequest.getRequestURL());
        RestResponse restResponse = new RestResponse();
        restResponse.setData(service.getUserInfoList());
        log.info("{}", service.getUserInfoList());
        return new ResponseEntity<RestResponse>(restResponse, HttpStatus.OK);
    }

    public ResponseEntity<RestResponse> login() {
        return null;
    }
}
