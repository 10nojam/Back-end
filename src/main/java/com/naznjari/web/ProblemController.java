package com.naznjari.web;

import com.naznjari.service.problem.ProblemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class ProblemController {
    private final ProblemsService service;
    @GetMapping("/problems")
    public String problemList(Model model) {
        model.addAttribute("problems", service.findAllDesc());
        return "problemList";
    }

    @GetMapping("/problem/{id}")
    public String problem(Model model, @PathVariable Long id) {
//        Problem problem =
        model.addAttribute("problem");
        return "problem";
    }
}
