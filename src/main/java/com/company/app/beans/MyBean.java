package com.company.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class MyBean {

    private String text = "hello world";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
