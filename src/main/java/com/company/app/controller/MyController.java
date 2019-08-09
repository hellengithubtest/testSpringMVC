package com.company.app.controller;

import com.company.app.beans.MyBean;
import com.company.app.service.ScheduledTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @Autowired
    private ScheduledTask task;
    @Autowired
    private MyBean bean;

/*    public MyController(ScheduledTask task, MyBean bean) {
        this.task = task;
        this.bean = bean;
    }*/

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