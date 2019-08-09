package com.company.app.service;

import com.company.app.beans.MyBean;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

@Service
public class ScheduledTask extends TimerTask {
    private MyBean myBean;

    public ScheduledTask(MyBean myBean) {

        this.myBean = myBean;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(this, 0, 1000);

    }

    public void changeText(String text) {
        myBean.setText(text);
    }

    public String getText() {
        return myBean.getText();
    }

    public void run() {
        System.out.println(myBean.getText());
    }
}