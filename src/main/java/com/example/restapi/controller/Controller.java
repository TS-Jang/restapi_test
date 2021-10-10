package com.example.restapi.controller;

import com.example.restapi.model.InfoDTO;
import com.example.restapi.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/get")
    ResponseEntity<?> getHelloWorld(@RequestParam(required = false) String name){

        return new ResponseEntity<>(service.myName(name), HttpStatus.OK);
    }

    @PostMapping("/post/{age}")
    ResponseEntity<?> postHelloWorld(@PathVariable("age") Integer age){
        return new ResponseEntity<>(service.myAge(age),HttpStatus.OK);
    }

    @PutMapping("/put")
    ResponseEntity<?> putHelloWorld(@RequestBody InfoDTO info){
        return new ResponseEntity<>(service.myInfo(info),HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    ResponseEntity<?> deleteHelloWorld(@RequestHeader String role, @RequestBody InfoDTO info){
        return new ResponseEntity<>(service.myInfoWithRole(role, info),HttpStatus.OK);
    }
}