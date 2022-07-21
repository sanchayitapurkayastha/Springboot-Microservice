package com.example.user.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Long deptId;
    private String deptName, deptAddr, deptCode;
}
