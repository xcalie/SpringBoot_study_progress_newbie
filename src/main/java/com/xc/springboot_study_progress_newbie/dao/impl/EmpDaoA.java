package com.xc.springboot_study_progress_newbie.dao.impl;

import com.xc.springboot_study_progress_newbie.dao.EmpDao;
import com.xc.springboot_study_progress_newbie.pojo.Emp;
import com.xc.springboot_study_progress_newbie.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        return empList;
    }
}
