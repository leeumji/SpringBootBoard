package sty.s01.demo.user.service;

import org.springframework.stereotype.Service;
import sty.s01.demo.user.mapper.UserMapper;

@Service
public class UserService {
    private UserMapper userMapper;
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Object getUserInfoList() {
        return userMapper.selectUserInfo();
    }
}
