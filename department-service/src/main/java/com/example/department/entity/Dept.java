package com.example.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    private String deptName, deptAddr, deptCode;
}
