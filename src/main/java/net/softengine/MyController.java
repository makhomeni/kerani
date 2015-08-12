package net.softengine;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * package com.ibbl.ictw;
 * Copyright (C) 2002-2003 Islami Bank Bangladesh Limited
 * <p/>
 * Original author: Khomeni
 * Date: 12/08/2015} 2:55 PM
 * Last modification by: KHomeni:
 * Last modification on 12.08.15:
 * Current revision: 1.0:
 * <p/>
 * Revision History:
 * ------------------
 */

@Controller
@RequestMapping("/my/")
public class MyController {

    @RequestMapping(value = "start1.edu", method = RequestMethod.GET)
    public
    @ResponseBody
    String start1() {
        return new Gson().toJson("Assalamu Alaykum 2");
    }

    @RequestMapping(value = "start2.edu", method = RequestMethod.GET)
    public String start2() {
        return "my/start_2";
    }
}
