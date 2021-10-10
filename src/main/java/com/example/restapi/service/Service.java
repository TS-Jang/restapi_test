package com.example.restapi.service;

import com.example.restapi.model.InfoDTO;

@org.springframework.stereotype.Service

public class Service {
    public String myName(String name) {
        if (name != null) {
            return "my name is " + name;
        } else {
            return "no name param";
        }
    }
    public String myAge(Integer age) {
        if (age != null) {
            return "my age is " + age;
        } else {
            return "no age param";
        }
    }
    public String myInfo(InfoDTO info){
        return myName(info.getName())+" / "+myAge(info.getAge());
    }

    public String myInfoWithRole(String role, InfoDTO info){
        return role +" / "+ myInfo(info);
    }
}
