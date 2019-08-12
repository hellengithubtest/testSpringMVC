package com.company.app.beans;

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
