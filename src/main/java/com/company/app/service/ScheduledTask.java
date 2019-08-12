package com.company.app.service;

import com.company.app.beans.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ScheduledTask {
    private MyBean myBean;

    @Autowired
    public ScheduledTask(MyBean myBean) {
        this.myBean = myBean;
    }

    public void changeText(String text) {
        myBean.setText(text);
    }

    public String getText() {
        return myBean.getText();
    }

    @Scheduled(fixedDelay = 1000)
    public void run() {
        System.out.println(myBean.getText());
    }
}