package com.june.video.service;

import com.june.video.domain.People;
import com.june.video.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private PeopleMapper userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public void updateUserLastLoginTime(Integer uId) {
        People people = new People();
        people.setId(uId);
        people.setLastLoginTime(new Date());
        userDao.updateByPrimaryKeySelective(people);
    }
}
