package biz.mathias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String doWelcome(Model model) {
		model.addAttribute("test","hejuuu");
		return "welcome";
	}
}
