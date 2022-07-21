package com.example.department.controller;

import com.example.department.entity.Dept;
import com.example.department.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/depts")
@Slf4j
public class DeptController {
    @Autowired
    private DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @PostMapping("/")
    public Dept saveDept(@RequestBody Dept dept) {
        log.info("Inside saveDept() of DeptController");
        return deptService.saveDept(dept);
    }

    @GetMapping("/{id}")
    public Dept findDeptById(@PathVariable("id") Long deptId) {
        log.info("Inside findDeptById() of DeptController");
        return deptService.findDeptById(deptId);
    }
}
