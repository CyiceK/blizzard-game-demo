package com.game.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.game.demo.dto.UserInfo;
import com.game.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/8 19:26
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select username from user where email = #{email, jdbcType=VARCHAR}")
    String getUsernameByEmail(@Param("email") String email);

    @Select("select username,password,enabled from user where email = #{email, jdbcType=VARCHAR}")
    User getUserLoginByEmail(@Param("email") String email);

    @Select("select username,password,enabled from user where username = #{username, jdbcType=VARCHAR}")
    User getUserLoginByUsername(@Param("username") String username);

    @Select("select name,email,phone,username,identity_id from user where username = #{username, jdbcType=VARCHAR}")
    UserInfo getUserByUsername(@Param("username") String username);
}
