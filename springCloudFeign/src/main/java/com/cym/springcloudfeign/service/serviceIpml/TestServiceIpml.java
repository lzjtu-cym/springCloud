package com.cym.springcloudfeign.service.serviceIpml;

import com.cym.springcloudfeign.service.ITestService;
import org.springframework.stereotype.Component;

/**
 * feign使用断路器service实现类，必须使用@Component注解，不然发现不了
 *
 * @author Chenyumin
 * @date 2020/10/17
 */

@Component
public class TestServiceIpml implements ITestService {

    @Override
    public String sayTestClientOne(String name) {
        return "sorry " + name;
    }
}
