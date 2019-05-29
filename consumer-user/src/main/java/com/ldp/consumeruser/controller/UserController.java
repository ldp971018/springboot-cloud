package com.ldp.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Return
 * @create 2019-05-29 16:56
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy/{name}")
    public String Buy(@PathVariable("name")String name){
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+"购买了"+ticket;
    }

}
