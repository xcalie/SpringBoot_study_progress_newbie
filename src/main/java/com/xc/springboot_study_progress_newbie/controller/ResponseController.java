package com.xc.springboot_study_progress_newbie.controller;

import com.xc.springboot_study_progress_newbie.pojo.Address;
import com.xc.springboot_study_progress_newbie.pojo.Result;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello Spring Boot!");
        /*return new Result(1, "success", "Hello Spring Boot!");*/
        return Result.success("Hello Spring Boot!");
    }

    @RequestMapping("/getAddress")
    public Result getAddresses(){
        List<Address> list = new ArrayList<>();
        list.add(new Address("China", "Beijing", "Beijing"));
        list.add(new Address("China", "Shanghai", "Shanghai"));
        list.add(new Address("China", "Guangdong", "Shenzhen"));
        return Result.success(list);
    }


}
