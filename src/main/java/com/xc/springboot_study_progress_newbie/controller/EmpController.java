package com.xc.springboot_study_progress_newbie.controller;

import com.xc.springboot_study_progress_newbie.pojo.Emp;
import com.xc.springboot_study_progress_newbie.pojo.Result;
import com.xc.springboot_study_progress_newbie.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Resource(name = "empServiceB")
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        //调用Service层方法
        List<Emp> empList = empService.listEmp();

        //返回结果
        return Result.success(empList);
    }
}
