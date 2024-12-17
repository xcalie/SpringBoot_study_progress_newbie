package com.xc.springboot_study_progress_newbie.controller;


import com.xc.springboot_study_progress_newbie.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
public class RequestController {


    @RequestMapping("/simpleParam")
    public String simpleParam(User user) {
        return "OK " + user.toString();
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(@RequestParam(value = "hobby", required = false) String[] name) {
        return "OK " + Arrays.toString(name);
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime date) {
        System.out.println(date);
        return "OK " + date.toString();
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        return "OK " + user.toString();
    }

    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id) {
        System.out.println(id);
        return "OK " + id;
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "OK " + id + " " + name;
    }
}


