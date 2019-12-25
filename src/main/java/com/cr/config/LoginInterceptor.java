package com.cr.config;

import com.cr.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("Login Interceptor preHandle method invoke...");
        User user = (User) WebUtils.getSessionAttribute(request, "user");
        if (user != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/login");
        return false;
    }

}
