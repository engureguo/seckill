package com.engure.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.engure.seckill.pojo.User;
import com.engure.seckill.vo.LoginVO;
import com.engure.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author engure
 * @since 2021-08-10
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVO vo, HttpServletRequest request, HttpServletResponse response);

    User getUserInfoByTicket(HttpServletRequest request, HttpServletResponse response, String ticket);

}
