package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.service.*;
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
    private userService user_service;
    private contactService contact_service;

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

    @RequestMapping(value = "/usertest", method = RequestMethod.GET)
    public String usertest(Model model) {
        model.addAttribute("users", user_service.findAll());
        return "contacttest";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<HLA> hla = hla_service.findAll();
        model.addAttribute("hlas", hla);
        return "index";
    }

    @RequestMapping(value = "/contacttest", method = RequestMethod.GET)
    public String contacttest(Model model) {
        List<contact> contacts = contact_service.findAll();
        model.addAttribute("contacts", contacts);
        return "contacttest";
    }

    // @GetMapping("/searched")
    // public String search(Model model) {
    // List<HLA> hlas = hla_service.findAll();
    // model.addAttribute("hlas", hlas);
    // return "searched";
    // }
    // @GetMapping("/searched")
    // public String find() {
    // return "searched";
    // }

    // @RequestMapping(value = "/searched", method = RequestMethod.POST)
    // public ModelAndView search(ModelAndView mav,
    // @RequestParam(value = "hla_id", required = false) Long hla_id,
    // @RequestParam(value = "a", required = false) Integer a,
    // @RequestParam(value = "b", required = false) Integer b,
    // @RequestParam(value = "c", required = false) Integer c,
    // @RequestParam(value = "dr", required = false) Integer dr) {
    // mav.setViewName("/searched");
    // mav.addObject("hla_id", hla_id);
    // mav.addObject("a", a);
    // mav.addObject("b", b);
    // mav.addObject("c", c);
    // mav.addObject("dr", dr);
    // List<HLA> result = hla_service.findAll();
    // mav.addObject("result", result);
    // mav.addObject("resultSize", result.size());
    // return mav;
    // }

}
