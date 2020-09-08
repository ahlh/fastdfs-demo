package com.lh.boot.fastdfs.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.lh.boot.fastdfs")
public class FastDfsConfig {

    private String fastDfsUrl;

    public String getFastDfsUrl() {
        return fastDfsUrl;
    }

    public void setFastDfsUrl(String fastDfsUrl) {
        this.fastDfsUrl = fastDfsUrl;
    }
}
