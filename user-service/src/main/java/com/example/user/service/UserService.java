package com.example.user.service;

import com.example.user.entity.User;
import com.example.user.repo.UserRepo;
import com.example.user.valueObject.Dept;
import com.example.user.valueObject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    /*public UserService(UserRepo userRepo, RestTemplate restTemplate) {
        this.userRepo = userRepo;
        this.restTemplate = restTemplate;
    }*/

    public User saveUser(User user) {
        log.info("Inside saveUser() of UserService");
        return userRepo.save(user);
    }

    public ResponseTemplateVO getUserWithDept(Long userId) {
        log.info("Inside getUserWithDept() of UserService");

        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepo.findByUserId(userId);

        Dept dept = restTemplate.getForObject("http://DEPT-SERVICE/depts/" + user.getDeptId(),
                Dept.class);

        vo.setUser(user);
        vo.setDept(dept);

        return vo;
    }
}
