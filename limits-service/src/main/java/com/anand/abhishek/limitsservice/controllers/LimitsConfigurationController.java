package com.anand.abhishek.limitsservice.controllers;

import com.anand.abhishek.limitsservice.bean.LimitsConfiguration;
import com.anand.abhishek.limitsservice.configurations.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfiguration(){
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
