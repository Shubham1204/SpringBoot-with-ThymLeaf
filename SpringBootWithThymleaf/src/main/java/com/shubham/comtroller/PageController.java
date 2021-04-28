package com.shubham.comtroller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("cars", List.of("mercedes","ferrari","mini cooper","bmw"));
		model.addAttribute("isActive", true);
		model.addAttribute("color", "matt");
		model.addAttribute("speakers", List.of("one","two","many"));
		model.addAttribute("title", "This is car page");
		model.addAttribute("time", LocalDate.now());
		return "home";
	}
}
