package com.xc.springboot_study_progress_newbie.pojo;

import lombok.Getter;
import lombok.Setter;


public class User {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private Address address;

    public User() {
    }

    public User(String userName, Integer age) {
        this.name = userName;
        this.age = age;
    }

    public User(String userName, Integer age, Address address) {
        this.name = userName;
        this.age = age;
        this.address = address;
    }

    public User(String userName, Integer age, String country, String province, String city) {
        this.name = userName;
        this.age = age;
        this.address = new Address(country, province, city);
    }

    public String toString() {
        return "UserName: " + name + ", age: " + age + ", Address: " + address.getCountry() + ", " + address.getProvince() + ", " + address.getCity();
    }
}

