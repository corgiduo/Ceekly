package com.corgiduo.ceekly.service;

import com.corgiduo.ceekly.dao.UserInfoMapper;
import com.corgiduo.ceekly.dao.UserMapper;
import com.corgiduo.ceekly.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userMapper.selectUserByUsername(s);
        logger.info(s + " is logining in.");
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("user"));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), authorities);

    }

//    public boolean register(String username, String password, String md5) {
//        if (!md5.equals("84d6fe70ac38569949c0fb01df858a6c")) {
//            return false;
//        }
//        Date date = new Date();
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        if (userMapper.insertUser(username, encoder.encode(password), date, date) == 1) {
//            int userId = userMapper.selectUserByUsername(username).getId();
//            if(userInfoMapper.insertUserInfo(userId, username, 3, "", date, date) == 1) {
//                return true;
//            }
//        }
//        return false;
//    }

    public List<User> getAll() {
        return userMapper.selectAllUser();
    }

}
