package com.mycryptotrade.mycryptotrade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/index")
    public String index(Model model) {

        Application app = new Application();

        String BinanceBTC;
        String PoloniexBTC;
        String HitbtcBTC;
        String BinanceETH;
        String PoloniexETH;
        String HitbtcETH;
        String BinanceZEC;
        String PoloniexZEC;
        String HitbtcZEC;
        String BinanceATOM;
        String PoloniexATOM;
        String HitbtcATOM;
        String BinanceXRP;
        String PoloniexXRP;
        String HitbtcXRP;

        List<String> values;
        Collect collect = new Collect();
        values = collect.getValue();

        BinanceBTC = values.get(1);
        PoloniexBTC = values.get(2);
        HitbtcBTC = values.get(3);
        BinanceETH = values.get(5);
        PoloniexETH = values.get(6);
        HitbtcETH = values.get(7);
        BinanceZEC = values.get(9);
        PoloniexZEC = values.get(10);
        HitbtcZEC = values.get(11);
        BinanceATOM = values.get(13);
        PoloniexATOM = values.get(14);
        HitbtcATOM = values.get(15);
        BinanceXRP = values.get(17);
        PoloniexXRP = values.get(18);
       HitbtcXRP = values.get(19);

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
