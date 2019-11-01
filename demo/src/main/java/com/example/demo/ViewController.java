package com.example.demo;

import com.example.demo.entity.HLA;
import com.example.demo.entity.user;
import com.example.demo.service.HLAService;
import com.example.demo.service.userService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ViewController {
    @Autowired
    private HLAService hla_service;
    private userService service;

    // @RequestMapping(value="/", method = RequestMethod.GET)
    // public String patient(Model model) {
    // List<HLA> h_list = hla_repository.findAll();
    // model.addAttribute("h_list", h_list);
    // return "patient";
    // }
    @GetMapping("/")
    public String patient() {
        return "patient";
    }

    @GetMapping("/index")
    public String index(Model model) {

        List<user> users = service.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    // @GetMapping("/searched")
    // public String search(Model model) {
    // List<HLA> hlas = hla_service.findAll();
    // model.addAttribute("hlas", hlas);
    // return "searched";
    // }
    @GetMapping("/searched")
    public String find() {
        return "searched";
    }

    @RequestMapping(value = "/searched", method = RequestMethod.POST)
    public ModelAndView search(ModelAndView mav, @RequestParam(value = "a", required = false) Integer a,
            @RequestParam(value = "b", required = false) Integer b,
            @RequestParam(value = "c", required = false) Integer c,
            @RequestParam(value = "dr", required = false) Integer dr) {
        mav.setViewName("/searched");
        mav.addObject("a", a);
        mav.addObject("b", b);
        mav.addObject("c", c);
        mav.addObject("dr", dr);
        List<HLA> result = hla_service.search(a, b, c, dr);
        mav.addObject("result", result);
        mav.addObject("resultSize", result.size());
        return mav;
    }

}
