package com.june.video.config.security;

import com.june.video.domain.People;
import com.june.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationProvider extends DaoAuthenticationProvider {
    private UserService userService;

    @Autowired
    public AuthenticationProvider(@Qualifier("userService")UserDetailsService userDetailsService) {
        this.setUserDetailsService(userDetailsService);
        this.setPasswordEncoder(new BCryptPasswordEncoder());
        this.hideUserNotFoundExceptions = false;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        super.additionalAuthenticationChecks(userDetails, authentication);
        People people = (People)userDetails;
        userService.updateUserLastLoginTime(people.getId());
    }
}
