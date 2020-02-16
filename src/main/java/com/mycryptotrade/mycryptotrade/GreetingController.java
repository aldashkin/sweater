package com.mycryptotrade.mycryptotrade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/index")
    public String index(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "index";
    }

    @GetMapping
    public String main(Map<String, String> model) {

        model.put("some", "help!");
        return "main";
    }
}
