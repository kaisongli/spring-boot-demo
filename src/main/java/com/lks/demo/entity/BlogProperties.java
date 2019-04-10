package com.lks.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by likaisong on 2019/4/10.
 */
@Component
public class BlogProperties {
    @Value("${com.lks.blog.name}")
    private String name;

    @Value("${com.lks.blog.title}")
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
