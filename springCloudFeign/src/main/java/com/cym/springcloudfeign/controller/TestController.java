package com.cym.springcloudfeign.controller;

import com.cym.springcloudfeign.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Chenyumin
 * @date 2020/10/17
 */

@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayTest(@RequestParam String name) {
        return testService.sayTestClientOne(name);
    }
}
