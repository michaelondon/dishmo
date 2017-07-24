package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DishmoController {

	@Resource
	private BreakfastRepository breakfastRepo;

	@RequestMapping("/sampleMenu")
	public String fetchSampleMenu(Model model) {
		model.addAttribute("breakfasts", breakfastRepo.findAll());
		return "sample-menu";
	}

	@RequestMapping("/reviews")
	public String fetchReviews(Model model) {
		return "reviews";
	}

	@RequestMapping("/home")
	public String fetchHome(Model model) {
		return "dishmohome";

	}

	@RequestMapping("/dishmonav")
	public String fetchNav(Model model) {
		return "dishmonav";
	}

	@RequestMapping("/about")
	public String fetchAbout(Model model) {
		return "about";

	}

	@RequestMapping("/contact")
	public String fetchContact(Model model) {
		return "contact";

	}

	@RequestMapping("/form-submit")
	public String fetchSubmit(Model model) {
		return "form-submit";
	}
}