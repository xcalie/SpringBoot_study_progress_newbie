package com.xc.springboot_study_progress_newbie.dao;

import com.xc.springboot_study_progress_newbie.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //获取所有员工信息
    public List<Emp> listEmp();
}
