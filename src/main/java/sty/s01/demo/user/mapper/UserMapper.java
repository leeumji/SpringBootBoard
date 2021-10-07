package sty.s01.demo.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import sty.s01.demo.user.model.UserInfo;

import java.util.List;

@Mapper // 맵퍼
public interface UserMapper {
    List<UserInfo> selectUserInfo();
}