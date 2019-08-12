package com.company.app.controller;

import com.company.app.beans.MyBean;
import com.company.app.service.ScheduledTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MyController {

    private MyBean bean;
    private ScheduledTask task;


    public MyController( MyBean bean, ScheduledTask task) {
        this.task = task;
        this.bean = bean;
    }

    @GetMapping("/")
    public ModelAndView printHome(ModelMap model) {
        model.addAttribute("fname", bean.getText());
        return new ModelAndView("index", model);
    }

    @RequestMapping(value= "/", method = RequestMethod.POST)
    public String outValue(HttpServletRequest request) {
        task.changeText(request.getParameter("fname"));
        return "redirect:/";
    }
}