package com.mycryptotrade.mycryptotrade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/index")
    public String index(Model model) {

        List<String> BinanceBTC;
        List<String> PoloniexBTC;
        List<String> HitbtcBTC;
        List<String> BinanceETH;
        List<String> PoloniexETH;
        List<String> HitbtcETH;
        List<String> BinanceZEC;
        List<String> PoloniexZEC;
        List<String> HitbtcZEC;
        List<String> BinanceATOM;
        List<String> PoloniexATOM;
        List<String> HitbtcATOM;
        List<String> BinanceXRP;
        List<String> PoloniexXRP;
        List<String> HitbtcXRP;



        String b = "qwer";

        BinanceBTC = Arrays.asList(b);
        PoloniexBTC = Arrays.asList(b);
        HitbtcBTC = Arrays.asList(b);
        BinanceETH = Arrays.asList(b);;
        PoloniexETH = Arrays.asList(b);
        HitbtcETH = Arrays.asList(b);
        BinanceZEC = Arrays.asList(b);
        PoloniexZEC = Arrays.asList(b);
        HitbtcZEC = Arrays.asList(b);
        BinanceATOM = Arrays.asList(b);
        PoloniexATOM = Arrays.asList(b);
        HitbtcATOM = Arrays.asList(b);
        BinanceXRP = Arrays.asList(b);
        PoloniexXRP = Arrays.asList(b);
        HitbtcXRP = Arrays.asList(b);


        model.addAttribute("BinanceBTC", BinanceBTC);
        model.addAttribute("PoloniexBTC", PoloniexBTC);
        model.addAttribute("HitbtcBTC", HitbtcBTC);
        model.addAttribute("BinanceETH", BinanceETH);
        model.addAttribute("PoloniexETH", PoloniexETH);
        model.addAttribute("HitbtcETH", HitbtcETH);
        model.addAttribute("BinanceZEC", BinanceZEC);
        model.addAttribute("PoloniexZEC", PoloniexZEC);
        model.addAttribute("HitbtcZEC", HitbtcZEC);
        model.addAttribute("BinanceATOM", BinanceATOM);
        model.addAttribute("PoloniexATOM", PoloniexATOM);
        model.addAttribute("HitbtcATOM", HitbtcATOM);
        model.addAttribute("BinanceXRP", BinanceXRP);
        model.addAttribute("PoloniexXRP", PoloniexXRP);
        model.addAttribute("HitbtcXRP", HitbtcXRP);


        return "index";
    }
}



