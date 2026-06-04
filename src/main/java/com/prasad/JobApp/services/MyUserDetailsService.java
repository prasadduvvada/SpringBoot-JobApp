package com.prasad.JobApp.services;

import com.prasad.JobApp.repositary.UserRepo;
import com.prasad.JobApp.model.User;
import com.prasad.JobApp.model.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException("user 404");
        }
        return new UserPrinciple(user);
    }
}
