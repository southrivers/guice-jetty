package com.hw.service.impl;

import com.hw.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String say() {
        return "custom service";
    }
}
