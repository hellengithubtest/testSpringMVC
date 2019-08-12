package com.company.app;

import com.company.app.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
/*        SpringApplication application = new SpringApplication(DeviceConnectionProvider.class);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);*/
    }
}
