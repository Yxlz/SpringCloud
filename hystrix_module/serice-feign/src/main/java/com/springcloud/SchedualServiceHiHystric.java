package com.springcloud;

import org.springframework.stereotype.Component;

/**
 * Createy Administrator on 2017/11/16 0016.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
