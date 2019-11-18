package com.mp.utils.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class UserController {
	 @RequestMapping("/01")
	    public  List<Map<String, String>> test01(){
	        List list = new ArrayList<Map<String, String>>();
	        Map map = new HashMap<String, String>();
	        map.put("hh", "44");
	        map.put("aa", "55");
	        list.add(map);
	        return list;
	    }
}
