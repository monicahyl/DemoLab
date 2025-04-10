package com.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangyulu
 * @Date 2025/4/10 11:58
 * @Description
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public void test() {
        log.info("TestController test");
    }
}
