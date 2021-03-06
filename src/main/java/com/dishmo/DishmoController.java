package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DishmoController {

	@Resource
	private BreakfastRepository breakfastRepo;

	@Resource
	private LunchRepository lunchRepo;

	@Resource
	private DinnerRepository dinnerRepo;

	@Resource
	private AppetizerRepository appetizerRepo;

	@Resource
	private DrinkRepository drinkRepo;

	@Resource
	private DessertRepository dessertRepo;

	@Resource
	private AlcoholicBeverageRepository alcoholicBeverageRepo;

	@RequestMapping("/sampleMenu")
	public String fetchSampleMenu(Model model) {
		model.addAttribute("breakfasts", breakfastRepo.findAll());
		model.addAttribute("lunches", lunchRepo.findAll());
		model.addAttribute("dinners", dinnerRepo.findAll());
		model.addAttribute("appetizers", appetizerRepo.findAll());
		model.addAttribute("drinks", drinkRepo.findAll());
		model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
		model.addAttribute("desserts", dessertRepo.findAll());
		return "sample-menu";
	}

	@RequestMapping("/sample-menus")
	public String fetchSampleMenus(Model model) {
		return "sample-menus";
	}

	@RequestMapping("/breakfast-reviews")
	public String fetchBreakfastReview(@RequestParam("id") Long id, Model model) {
		Breakfast selectedBreakfastReview = breakfastRepo.findOne(id);
		model.addAttribute(selectedBreakfastReview);
		return "breakfast-reviews";
	}

	@RequestMapping("/lunch-reviews")
	public String fetchLunchReview(@RequestParam("id") Long id, Model model) {
		Lunch selectedLunchReview = lunchRepo.findOne(id);
		model.addAttribute(selectedLunchReview);
		return "lunch-reviews";
	}

	@RequestMapping("/dinner-reviews")
	public String fetchDinnerReview(@RequestParam("id") Long id, Model model) {
		Dinner selectedDinnerReview = dinnerRepo.findOne(id);
		model.addAttribute(selectedDinnerReview);
		return "dinner-reviews";
	}

	@RequestMapping("/appetizer-reviews")
	public String fetchAppetizerReview(@RequestParam("id") Long id, Model model) {
		Appetizer selectedAppetizerReview = appetizerRepo.findOne(id);
		model.addAttribute(selectedAppetizerReview);
		return "appetizer-reviews";
	}

	@RequestMapping("/drink-reviews")
	public String fetchDrinkReview(@RequestParam("id") Long id, Model model) {
		Drink selectedDrinkReview = drinkRepo.findOne(id);
		model.addAttribute(selectedDrinkReview);
		return "drink-reviews";
	}

	@RequestMapping("/alcoholic-beverage-reviews")
	public String fetchAlcoholicBeverageReview(@RequestParam("id") Long id, Model model) {
		AlcoholicBeverage selectedAlcoholicBeverageReview = alcoholicBeverageRepo.findOne(id);
		model.addAttribute(selectedAlcoholicBeverageReview);
		return "alcoholic-beverage-reviews";
	}

	@RequestMapping("/dessert-reviews")
	public String fetchDessertReview(@RequestParam("id") Long id, Model model) {
		Dessert selectedDessertReview = dessertRepo.findOne(id);
		model.addAttribute(selectedDessertReview);
		return "dessert-reviews";
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
