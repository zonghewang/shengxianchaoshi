package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:"+userId);
     //   User user=null;
        if (userId==1) {
    //        user = new User();
      //      user.setAge(11);
     //       user.setId(1);
     //      user.setPassword("123");
    //        user.setUserName("javen");
        }


       // model.addAttribute("user", user);


        return "index";
    }
}
