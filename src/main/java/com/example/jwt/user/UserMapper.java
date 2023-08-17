package com.example.jwt.user;

import com.example.jwt.command.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public void join(UserVO vo);
    public UserVO login(String username);
}
