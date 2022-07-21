package com.example.department.service;

import com.example.department.entity.Dept;
import com.example.department.repository.DeptRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeptService {
    @Autowired
    private DeptRepo deptRepo;

    public DeptService(DeptRepo deptRepo) {
        this.deptRepo = deptRepo;
    }

    public Dept saveDept(Dept dept) {
        log.info("Inside saveDept() of DeptService");
        return deptRepo.save(dept);
    }

    public Dept findDeptById(Long deptId) {
        log.info("Inside findDeptById() of DeptService");
        return deptRepo.findByDeptId(deptId);
    }
}
