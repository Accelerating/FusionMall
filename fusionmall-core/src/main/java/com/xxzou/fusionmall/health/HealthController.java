package com.xxzou.fusionmall.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final long startTime = System.currentTimeMillis();

    @RequestMapping("/health")
    public Long health(){
        return System.currentTimeMillis() - startTime;
    }

}
