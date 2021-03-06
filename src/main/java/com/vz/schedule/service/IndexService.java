package com.vz.schedule.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.vz.schedule.pojo.User;


/**
 * indexService接口
 *
 * @author victorzhang
 */
public interface IndexService {

    /**
     * 验证用户登陆
     *
     * @param username
     * @param password
     */
    User doLogin(String username, String password, HttpServletRequest request);

    /**
     * 根据email查找数据库中是否存在该用户
     *
     * @param email
     * @return
     */
    Map<String, Object> queryUserByEmail(String email);

    /**
     * 重设密码
     *
     * @param username
     * @param checkcode
     * @param findPwd
     * @param rfindPwd
     * @return
     */
    Map<String, Object> doResetPwd(String username, String checkcode,
                                   String findPwd, String rfindPwd);

    /**
     * 退出系统，消除系统中session
     *
     * @return
     */
    void quitSystem(HttpServletRequest request, String username);


}
