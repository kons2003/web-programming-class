package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeworkController {

	private int number = 0;

	@GetMapping("homework/test1")
	public String number(Model model) {
		model.addAttribute("number", number);
		return "homework/test1";
	}

	@PostMapping("homework/test1")
	public String number(Model model, Integer number) {
		number++;
		model.addAttribute("number", number);
		return "homework/test1";
	}
	
	@GetMapping("homework/test2")
	public String select(Model model) {
		return "homework/test2";
	}
	
	@PostMapping("homework/test2")
	public String select(Model model, String numString) {
		model.addAttribute("numString", numString);
		model.addAttribute("result", numString);
		return "homework/test2";
	}

}
