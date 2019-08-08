package main.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

@Controller
public class MyController {
    ScheduledTask task = new ScheduledTask();
    @GetMapping("/")
        public ModelAndView printHome(ModelMap model) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
        model.addAttribute("fname", task.getText());
        return new ModelAndView("index", model);
    }

    @RequestMapping(value= "/", method = RequestMethod.POST)
        public String outValue(@ModelAttribute("fname") String fname, BindingResult result, Model model) {
        System.out.println(fname);
        task.setText(fname);
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}