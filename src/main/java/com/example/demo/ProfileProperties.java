package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@ConstructorBinding
@ConfigurationProperties("prop")
public class ProfileProperties {
    private final String propname;
    private final List<String> list;

    public ProfileProperties(String appname, List<String> list) {
        this.propname = appname;
        this.list = list;
    }

    public String getPropName() {
        return propname;
    }

    public List<String> getList() {
        return list;
    }
}
