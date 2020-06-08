package com.naznjari.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProblemController {
    @GetMapping()
    public String problem() {
        return "problem";
    }
}
