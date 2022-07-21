package com.example.department.repository;

import com.example.department.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Long> {
    Dept findByDeptId(Long deptId);
}
