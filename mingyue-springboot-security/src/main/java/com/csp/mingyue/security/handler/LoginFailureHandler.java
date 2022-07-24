package com.csp.mingyue.security.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**
 * @author Strive
 * @date 2022/4/22 15:07
 * @description
 */
@Slf4j
@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {
  @Override
  public void onAuthenticationFailure(
      HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
      throws IOException, ServletException {
    log.info("login error");
    if (e instanceof AccountExpiredException) {
      // 账号过期
      log.info("[登录失败] - 用户账号过期");
    } else if (e instanceof BadCredentialsException) {
      // 密码错误
      log.info("[登录失败] - 用户密码错误");

    } else if (e instanceof CredentialsExpiredException) {
      // 密码过期
      log.info("[登录失败] - 用户密码过期");

    } else if (e instanceof DisabledException) {
      // 用户被禁用
      log.info("[登录失败] - 用户被禁用");

    } else if (e instanceof LockedException) {
      // 用户被锁定
      log.info("[登录失败] - 用户被锁定");

    } else if (e instanceof InternalAuthenticationServiceException) {
      // 内部错误
      log.error(String.format("[登录失败] - [%s]内部错误"), e);
    } else {
      // 其他错误
      log.error(String.format("[登录失败] - [%s]其他错误"), e);
    }
  }
}
