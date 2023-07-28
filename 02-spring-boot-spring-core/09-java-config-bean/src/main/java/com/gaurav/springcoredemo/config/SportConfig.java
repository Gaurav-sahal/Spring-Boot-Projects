package com.gaurav.springcoredemo.config;

import com.gaurav.springcoredemo.common.Coach;
import com.gaurav.springcoredemo.common.SwimCoach;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
