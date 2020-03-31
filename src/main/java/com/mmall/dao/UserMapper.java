package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 查找用户名是否存在
     * @param username
     * @return
     */
    int CheckUsername(String username);

    /**
     * 登录成功将用户信息返回给前端
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 查找邮箱是否存在
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 忘记密码时, 通过username查找设置的问题
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 通过用户户和问题, 查找答案是否存在
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    int checkPassword(@Param("password") String password, @Param("userId") Integer userId);

    int checkEmailByUserId(@Param("email") String email, @Param("userId") Integer userId);
}