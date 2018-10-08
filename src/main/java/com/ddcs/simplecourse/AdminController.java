package com.ddcs.simplecourse;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/admin")
public class AdminController {
    @RequestMapping(value = "/signin",method = RequestMethod.PUT,produces = "application/json")
    public Status signin(AdminEntity adminEntity) {

    }
    @RequestMapping(value = "/signout",method = RequestMethod.DELETE,produces = "application/json")
    public Status signout() {

    }
    @RequestMapping(value = "/signup",method = RequestMethod.PUT,produces = "application/json")
    public Status signup(AdminEntity adminEntity ) {

    }
}
