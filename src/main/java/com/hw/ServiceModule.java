package com.hw;

import com.google.inject.AbstractModule;
import com.hw.service.HelloService;
import com.hw.service.impl.HelloServiceImpl;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloService.class).to(HelloServiceImpl.class);
    }
}
