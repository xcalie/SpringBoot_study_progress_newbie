package com.xc.springboot_study_progress_newbie.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String country;
    private String province;
    private String city;

    public Address() {
    }

    public Address(String country, String province, String city) {
        this.country = country;
        this.province = province;
        this.city = city;
    }
}
