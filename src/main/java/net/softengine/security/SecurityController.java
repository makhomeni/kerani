package net.softengine.security;

import com.google.gson.Gson;
import net.softengine.security.dao.TokenDao;
import net.softengine.security.dao.UserDao;
import net.softengine.security.model.Token;
import net.softengine.security.model.User;
import net.softengine.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * package net.softengine.security;
 * Copyright (C) 2002-2003 Soft Engine Inc.
 * <p/>
 * Original author: Khomeni
 * Date: 12/08/2015 5:02 PM
 * Last modification by: Khomeni:
 * Last modification on 12.08.2015:
 * Current revision: 1.0:
 * <p/>
 * Revision History:
 * ------------------
 */
@Controller
@RequestMapping("/security/")
public class SecurityController {


    @Autowired
    private SecurityService securityService;



    @RequestMapping(value = "start1.edu", method = RequestMethod.GET)
    public
    @ResponseBody
    String start1() {
        return new Gson().toJson("Secure");
    }

    @RequestMapping(value = "start2.edu", method = RequestMethod.GET)
    public String start2() {
        return "security/start_2";
    }


    @RequestMapping(value = "executeUs.edu", method = RequestMethod.GET)
    public
    @ResponseBody
    String executeUs() {
        Token token = new Token();

        User user = new User();
        user.setActive(true);
        securityService.save(user);

        return new Gson().toJson("Secure");
    }


}
