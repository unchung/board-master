package com.example.common.Mapper;

import com.example.common.Vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void saveUser(UserVo userVo);
}
