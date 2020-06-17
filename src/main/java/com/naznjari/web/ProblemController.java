package com.naznjari.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ProblemController {
    @GetMapping("/problems")
    public String problemList() {

        return "problemList";
    }

    @GetMapping("/problem")
    public String problem() {
        return "problem";
    }
}
