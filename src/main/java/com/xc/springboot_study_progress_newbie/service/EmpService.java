package com.xc.springboot_study_progress_newbie.service;

import com.xc.springboot_study_progress_newbie.pojo.Emp;

import java.util.List;

public interface EmpService {
    //查询所有员工信息
    List<Emp> listEmp();
}
