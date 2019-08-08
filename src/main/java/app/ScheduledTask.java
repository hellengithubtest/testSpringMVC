package main.java.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
    private String text = "hello world";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public void run() {
        System.out.println(text);
    }
}