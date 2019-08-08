package main.java.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.util.Timer;

@Controller
public class MyController {
    ScheduledTask task = new ScheduledTask();
/*    @RequestMapping(value = "/", method = RequestMethod.GET)public String printHome(ModelMap model) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
        model.addAttribute("message", "Hello Home");
        return "index";
    }*/

    @GetMapping("/")
        public String outValue(@RequestParam(name="fname", required=false, defaultValue = "test") String fname, Model model) {
        model.addAttribute("name", fname);
        System.out.println("Request mapping");
        System.out.println(fname);
        task.setText(fname);
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}