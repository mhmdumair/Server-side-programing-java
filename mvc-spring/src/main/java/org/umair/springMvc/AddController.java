package org.umair.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
//    @RequestMapping("/add")
//    public ModelAndView add(HttpServletRequest req, HttpServletResponse res){
//        int a = Integer.parseInt(req.getParameter("num1"));
//        int b = Integer.parseInt(req.getParameter("num2"));
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("display");
//        mv.addObject("result",a+b);
//        return mv;
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",a+b);
        return mv;
    }
}
