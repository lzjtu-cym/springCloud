package com.cym.springcloudfeign.service;

import com.cym.springcloudfeign.service.serviceIpml.TestServiceIpml;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chenyumin
 * @date 2020/10/17
 */

@FeignClient(value = "service-client", fallback = TestServiceIpml.class)
public interface ITestService {

    /**
     * Feign测试调用springCloudClient接口
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayTestClientOne(@RequestParam(value = "name") String name);
}
