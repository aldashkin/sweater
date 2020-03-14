package com.mycryptotrade.mycryptotrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect {
    public List<String> list = new ArrayList<>();
    public Collect(){
        this.list.addAll(Arrays.asList(Application.price));
    }
    public List<String> getValue (){
        return list;
    }
}
