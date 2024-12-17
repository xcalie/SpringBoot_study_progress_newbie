package com.xc.springboot_study_progress_newbie.service.impl;

import com.xc.springboot_study_progress_newbie.dao.EmpDao;
import com.xc.springboot_study_progress_newbie.dao.impl.EmpDaoA;
import com.xc.springboot_study_progress_newbie.pojo.Emp;
import com.xc.springboot_study_progress_newbie.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceB implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {

        List<Emp> empList = empDao.listEmp();//1. 加载并解析emp.xml文件

        empList.stream().forEach(emp -> {
            //处理 gender 1:男 2:女
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男士");
            } else if ("2".equals(gender)) {
                emp.setGender("女士");
            }

            //处理 job 1:程序员 2:测试 3:产品经理
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("程序员");
            } else if ("2".equals(job)) {
                emp.setJob("测试");
            } else if ("3".equals(job)) {
                emp.setJob("产品经理");
            }
        });

        return empList;
    }
}
