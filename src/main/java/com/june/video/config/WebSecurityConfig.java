package com.june.video.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Elements.REMEMBER_ME;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String WEB_TOKEN = "web-token";
    private static final String WEB_REM_ME_KEY = "web-rem-me-key";
    private static final int TOKEN_VALIDITY_SECONDS = 7776000;// 7776000 - 3 months, 15552000 - 6 months
    @Autowired
    private WebAuthenticationSuccessHandler webAuthenticationSuccessHandler;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**", "/imagecode", "/uploaded/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable(); //允许iframe内嵌
        /**
         * config for web security
         */
        http
                .antMatcher("/**")
                .authorizeRequests()
                //授权控制
                .antMatchers("/video/**").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .successHandler(webAuthenticationSuccessHandler)
                //.defaultSuccessUrl("/index")
                .permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .permitAll()
                .and()
                .rememberMe()
                .key(WEB_REM_ME_KEY)
                .rememberMeParameter(REMEMBER_ME)
                .rememberMeCookieName(WEB_TOKEN)
                .tokenValiditySeconds(TOKEN_VALIDITY_SECONDS)
                .and()
                .exceptionHandling().accessDeniedPage("/403");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ADMIN")
                .and()
                .withUser("user").password("123456").roles("USER");
    }

}
