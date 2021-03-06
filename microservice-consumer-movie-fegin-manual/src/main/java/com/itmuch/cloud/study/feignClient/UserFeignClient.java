package com.itmuch.cloud.study.feignClient;

import com.itmuch.cloud.study.POJO.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


public interface UserFeignClient {

    @GetMapping(value = "{id}")
    public User findById(@PathVariable("id") Long id);

}
