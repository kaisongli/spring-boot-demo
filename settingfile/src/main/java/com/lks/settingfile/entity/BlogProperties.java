package com.lks.settingfile.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by likaisong on 2019/5/28.
 */
@Component
public class BlogProperties {
    @Value("${com.lks.blog.name}")
    private String name;

    @Value("${com.lks.blog.title}")
    private String title;

    @Value("${com.lks.blog.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
