package com.example.demo;

import com.example.demo.service.HLAService;
import com.example.demo.entity.HLA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @Autowired
    private HLAService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<HLA> view() {
        return service.findAll();
    }
}
