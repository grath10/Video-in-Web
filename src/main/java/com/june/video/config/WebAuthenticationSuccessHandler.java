package com.june.video.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class WebAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebAuthenticationSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        User user = (User)authentication.getPrincipal();
        httpServletRequest.getSession().setAttribute("user", user);
        httpServletResponse.sendRedirect("/index");
    }
}
