package com.ydy.utils;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Component
public class MyRestTemplate extends RestTemplate {

    public MyRestTemplate() {
        this.getMessageConverters()
                .set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));
    }
}
