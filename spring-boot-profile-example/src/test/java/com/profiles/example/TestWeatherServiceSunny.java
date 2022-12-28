package com.profiles.example;

import com.profiles.example.service.WeatherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestWeatherServiceSunny {

    @Autowired
    WeatherService weatherService;

    @Test
    public void testRainingProfile() {
        String output = weatherService.forecast();
        assertThat(output).contains("Today is sunny day!");
    }
}