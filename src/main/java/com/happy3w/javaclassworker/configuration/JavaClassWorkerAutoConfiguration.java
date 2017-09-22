package com.happy3w.javaclassworker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaClassWorkerAutoConfiguration {

    @Bean
    public ValueCenterFactoryProcessor valueCenterFactoryProcessor() {
        return new ValueCenterFactoryProcessor();
    }
}
