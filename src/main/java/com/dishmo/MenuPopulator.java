package com.dishmo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuPopulator implements CommandLineRunner {

	@Resource
	private BreakfastRepository breakfastRepo;

	@Resource
	private LunchRepository lunchRepo;

	@Resource
	private DinnerRepository dinnerRepo;

	@Resource
	private DessertRepository dessertRepo;

	@Resource
	private DrinkRepository drinkRepo;

	@Resource
	private AlcoholicBeverageRepository alcBevRepo;

	@Resource
	private AppetizerRepository appetizerRepo;

	@Resource
	private SampleMenuRepository sampleMenuRepo;

	@Override
	public void run(String... args) throws Exception {

		// Breakfast
		SampleMenu breakfast = new SampleMenu();
		sampleMenuRepo.save(breakfast);

		Breakfast housemadeGranola = new Breakfast("Housemade Granola",
				"Organic rolled oats, almonds, pecans, fat-free Greek yogurt, fresh fruit, honey and pistachio praline brittle.",
				"9", breakfast, "/images/Breakfast/housemade-granola.jpeg", "/images/Breakfast/housemade-granola-2.jpg",
				"/images/Breakfast/housemade-granola-3.jpg");
		Breakfast prosciuttoAndPoachedEggs = new Breakfast("Prosciutto and Poached Eggs",
				"Three organic valley eggs* and La Quercia prosciutto on toasted rosemary focaccia with parmesan.",
				"13", breakfast, "/images/Breakfast/prosciutto-and-poached-eggs.jpeg",
				"/images/Breakfast/prosciutto-and-poached-eggs-2.jpg",
				"/images/Breakfast/prosciutto-and-poached-eggs-3.jpg");
		Breakfast cloudNinePancakes = new Breakfast("Cloud Nine Pancakes",
				"Three ricotta pancakes served with real maple syrup and bananas.", "13", breakfast,
				"/images/Breakfast/cloud-nine-pancakes.jpeg", "/images/Breakfast/cloud-nine-pancakes-2.jpg",
				"/images/Breakfast/cloud-nine-pancakes-3.jpg");
		Breakfast sweetPotatoAndTurkeyHash = new Breakfast("Sweet Potato and Turkey Hash",
				"Applewood smoked turkey, red peppers, sweet onions, and two sunny eggs.*", "13", breakfast,
				"/images/Breakfast/sweet-potato-and-turkey-hash.png",
				"/images/Breakfast/sweet-potato-and-turkey-hash-2.jpg",
				"/images/Breakfast/sweet-potato-and-turkey-hash-3.jpg");
		Breakfast bigBurrito = new Breakfast("Big Burrito",
				"Eggs, organic black beans, roasted sweet potatoes, sauteed peppers & onions, melted white cheddar and Northstar's salsa.",
				"11", breakfast, "/images/Breakfast/big-burrito.jpg", "/images/Breakfast/big-burrito-2.jpg",
				"/images/Breakfast/big-burrito-3.jpg");
		Breakfast cowboyBreakfast = new Breakfast("Cowboy Breakfast",
				"Two organic eggs prepared any style*, bacon or sausage and a warm buttermilk biscuit with Michigan black cherry preserves.",
				"13", breakfast, "/images/Breakfast/cowboy-breakfast.jpg", "/images/Breakfast/cowboy-breakfast-2.jpg",
				"/images/Breakfast/cowboy-breakfast-3.jpg");
		Breakfast theStandardEggSandwich = new Breakfast("The Standard Egg Sandwich",
				"Warm from the oven buttermilk buscuit topped with two over-medium eggs* and aged white cheddar.",
				"9.5", breakfast, "/images/Breakfast/the-standard-egg-sandwich.jpeg",
				"/images/Breakfast/the-standard-egg-sandwich-2.jpg",
				"/images/Breakfast/the-standard-egg-sandwich-3.jpg");

		breakfastRepo.save(housemadeGranola);
		breakfastRepo.save(prosciuttoAndPoachedEggs);
		breakfastRepo.save(cloudNinePancakes);
		breakfastRepo.save(sweetPotatoAndTurkeyHash);
		breakfastRepo.save(bigBurrito);
		breakfastRepo.save(cowboyBreakfast);
		breakfastRepo.save(theStandardEggSandwich);

		// Lunch
		SampleMenu lunch = new SampleMenu();
		sampleMenuRepo.save(lunch);

		Lunch simpleSalad = new Lunch("Simple Salad", "Crisp greens and rosemary croutons with café vinaigrette.", "5",
				lunch, "/images/Lunch/simple-salad.jpeg", "/images/Lunch/simple-salad-2.jpg",
				"/images/Lunch/simple-salad-3.jpg");
		Lunch choppedSalad = new Lunch("Chopped Salad",
				"Applewood smoked turkey, bacon, avocado, blue cheese, almonds, croutons and apples with café vinaigrette.",
				"15", lunch, "/images/Lunch/chopped-salad.jpeg", "/images/Lunch/chopped-salad-2.jpg",
				"/images/Lunch/chopped-salad-3.jpg");
		Lunch beechwoldSalad = new Lunch("Beechwold Salad",
				"Roasted chicken, dates, avocado, tomatoes, corn, goat cheese, croutons and almonds with champagne vinaigrette.",
				"14", lunch, "/images/Lunch/beechwold-salad.jpeg", "/images/Lunch/beechwold-salad-2.jpg",
				"/images/Lunch/beechwold-salad-3.jpg");
		Lunch citrusCrunchSalad = new Lunch("Citrus Crunch Salad",
				"Shredded chicken, crisp vegetables, mango and fresh herbs with tortillas and peanut lime dressing.",
				"14.5", lunch, "/images/Lunch/citrus-crunch-salad.jpg", "/images/Lunch/citrus-crunch-salad-2.jpg",
				"/images/Lunch/citrus-crunch-salad-3.jpg");
		Lunch buddhaBowl = new Lunch("Buddha Bowl",
				"Pan seared organic tofu or roasted chicken, long-grain brown rice with peanut sauce and bright veggies.",
				"13", lunch, "/images/Lunch/buddha-bowl.jpeg", "/images/Lunch/buddha-bowl-2.jpg",
				"/images/Lunch/buddha-bowl-3.jpg");
		Lunch squareMeal = new Lunch("Square Meal",
				"Spicy organic black beans over brown rice with sauteed peppers & onions, avocado, cheddar and corn tortillas.",
				"10", lunch, "/images/Lunch/square-meal.jpg", "/images/Lunch/square-meal-2.jpg",
				"/images/Lunch/square-meal-3.jpg");
		Lunch northstarBurger = new Lunch("Northstar Burger",
				"Just made with organic black beans, brown rice and beets, topped with white cheddar, kale, tomato, pickle and onion + simple salad.",
				"14", lunch, "/images/Lunch/northstar-burger.jpeg", "/images/Lunch/northstar-burger-2.jpg",
				"/images/Lunch/northstar-burger-3.jpg");
		Lunch classicCheeseburger = new Lunch("Classic Cheeseburger",
				"Niman Ranch brisket and chuck*, ground in-house daily, topped with cheddar, lettuce, tomato, onion, pickle + breakfast potatoes.",
				"15", lunch, "/images/Lunch/classic-cheeseburger.jpeg", "/images/Lunch/classic-cheeseburger-2.jpg",
				"/images/Lunch/classic-cheeseburger-3.jpg");
		Lunch fishSandwich = new Lunch("Fish Sandwich",
				"Grilled barramundi filet with lettuce, tomato, red onion, and herb aioli + simple salad.", "17", lunch,
				"/images/Lunch/fish-sandwich.jpg", "/images/Lunch/fish-sandwich-2.jpg",
				"/images/Lunch/fish-sandwich-3.jpg");
		Lunch chickenAndAvoSandwich = new Lunch("Chicken & Avocado Sandwich",
				"Roasted Bell & Evans chicken, avocado, smoked gouda, roasted red peppers and greens with cayenne aioli + sweet potato fries.",
				"15", lunch, "/images/Lunch/chicken-and-avocado-sandwich.jpg",
				"/images/Lunch/chicken-and-avocado-sandwich-2.jpg", "/images/Lunch/chicken-and-avocado-sandwich-3.jpg");
		Lunch thaiburrito = new Lunch("Thai Burrito",
				"Seared organic tofu or roasted chicken with peanut sauce, crunchy slaw and brown rice + tortilla chips & Thai dipping sauce.",
				"12.5", lunch, "/images/Lunch/thai-burrito.jpg", "/images/Lunch/thai-burrito-2.jpg",
				"/images/Lunch/thai-burrito-3.jpg");
		Lunch sweetBasilBurrito = new Lunch("Sweet Basil Burrito",
				"Rotisserie roasted chicken or seared tofu with creamy pesto, sauteed veggies and brown rice + tortilla chips & Northstar's salsa.",
				"13", lunch, "/images/Lunch/sweet-basil-burrito.jpg", "/images/Lunch/sweet-basil-burrito-2.jpg",
				"/images/Lunch/sweet-basil-burrito-3.jpg");
		Lunch spicyHarvest = new Lunch("Spicy Harvest",
				"Smoked gouda, pepperoni, corn, jalapenos with organic tomato sauce on a whole wheat crust.", "14",
				lunch, "/images/Lunch/spicy-harvest-pizza.jpg", "/images/Lunch/spicy-harvest-pizza-2.jpg",
				"/images/Lunch/spicy-harvest-pizza-3.jpg");
		Lunch housemadeSausage = new Lunch("Housemade Sausage",
				"Crumbled sausage and Mamma Lil's Peppers paired with organic tomato sauce, provolone and parmesan.",
				"14", lunch, "/images/Lunch/housemade-sausage-pizza.jpg", "/images/Lunch/housemade-sausage-pizza-2.jpg",
				"/images/Lunch/housemade-sausage-pizza-3.jpg");
		Lunch smokedGoudaAndChicken = new Lunch("Smoked Gouda + Chicken",
				"Rotisserie roasted chicken, Northstar's BBQ sauce, red peppers, onions, cilantro and peanuts.", "14",
				lunch, "/images/Lunch/smoked-gouda-and-chicken-pizza.jpeg",
				"/images/Lunch/smoked-gouda-and-chicken-pizza-2.jpg",
				"/images/Lunch/smoked-gouda-and-chicken-pizza-3.jpg");
		Lunch highStreetVegetable = new Lunch("High Street Vegetable",
				"Crunchy veggies, tomatoes, mushrooms, jalapenos, sunflower seeds, aged provolone and Grana Padano.",
				"12", lunch, "/images/Lunch/high-street-vegetable-pizza.jpeg",
				"/images/Lunch/high-street-vegetable-pizza-2.jpg", "/images/Lunch/high-street-vegetable-pizza-3.jpg");

		lunchRepo.save(simpleSalad);
		lunchRepo.save(choppedSalad);
		lunchRepo.save(beechwoldSalad);
		lunchRepo.save(citrusCrunchSalad);
		lunchRepo.save(buddhaBowl);
		lunchRepo.save(squareMeal);
		lunchRepo.save(northstarBurger);
		lunchRepo.save(classicCheeseburger);
		lunchRepo.save(fishSandwich);
		lunchRepo.save(chickenAndAvoSandwich);
		lunchRepo.save(thaiburrito);
		lunchRepo.save(sweetBasilBurrito);
		lunchRepo.save(spicyHarvest);
		lunchRepo.save(housemadeSausage);
		lunchRepo.save(smokedGoudaAndChicken);
		lunchRepo.save(highStreetVegetable);

		// Dinner
		SampleMenu dinner = new SampleMenu();
		sampleMenuRepo.save(dinner);

		Dinner simpleSaladD = new Dinner("Simple Salad", "Crisp greens and rosemary croutons with café vinaigrette.",
				"5", dinner, "/images/Dinner/simple-salad.jpeg", "/images/Lunch/simple-salad-2.jpg",
				"/images/Lunch/simple-salad-3.jpg");
		Dinner choppedSaladD = new Dinner("Chopped Salad",
				"Applewood smoked turkey, bacon, avocado, blue cheese, almonds, croutons and apples with face vinaigrette.",
				"15", dinner, "/images/Dinner/chopped-salad.jpeg", "/images/Lunch/chopped-salad-2.jpg",
				"/images/Lunch/chopped-salad-3.jpg");
		Dinner beechwoldSaladD = new Dinner("Beechwold Salad",
				"Roasted chicken, dates, avocado, tomatoes, corn, goat cheese, croutons and almonds with champagne vinaigrette.",
				"14", dinner, "/images/Dinner/beechwold-salad.jpeg", "/images/Lunch/beechwold-salad-2.jpg",
				"/images/Lunch/beechwold-salad-3.jpg");
		Dinner citrusCrunchSaladD = new Dinner("Citrus Crunch Salad",
				"Shredded chicken, crisp vegetables, mango and fresh herbs with tortillas and peanut lime dressing.",
				"14.5", dinner, "/images/Dinner/citrus-crunch-salad.jpg", "/images/Lunch/citrus-crunch-salad-2.jpg",
				"/images/Lunch/citrus-crunch-salad-3.jpg");
		Dinner buddhaBowlD = new Dinner("Buddha Bowl",
				"Pan seared organic tofu or roasted chicken, long-grain brown rice with peanut sauce and bright veggies.",
				"13", dinner, "/images/Dinner/buddha-bowl.jpeg", "/images/Lunch/buddha-bowl-2.jpg",
				"/images/Lunch/buddha-bowl-3.jpg");
		Dinner squareMealD = new Dinner("Square Meal",
				"Spicy organic black beans over brown rice with sauteed peppers & onions, avocado, cheddar and corn tortillas.",
				"10", dinner, "/images/Dinner/square-meal.jpg", "/images/Lunch/square-meal-2.jpg",
				"/images/Lunch/square-meal-3.jpg");
		Dinner northstarBurgerD = new Dinner("Northstar Burger",
				"Just made with organic black beans, brown rice and beets, topped with white cheddar, kale, tomato, pickle and onion + simple salad.",
				"14", dinner, "/images/Dinner/northstar-burger.jpeg", "/images/Lunch/northstar-burger-2.jpg",
				"/images/Lunch/northstar-burger-3.jpg");
		Dinner classicCheeseburgerD = new Dinner("Classic Cheeseburger",
				"Nilman Ranch brisket and chuck*, ground in-house daily, topped with cheddar, lettuce, tomato, onion, pickle + breakfast potatoes.",
				"15", dinner, "/images/Dinner/classic-cheeseburger.jpeg", "/images/Lunch/classic-cheeseburger-2.jpg",
				"/images/Lunch/classic-cheeseburger-3.jpg");
		Dinner fishSandwichD = new Dinner("Fish Sandwich",
				"Grilled barramundi filet with lettuce, tomato, red onion, and herb aioli + simple salad.", "17",
				dinner, "/images/Dinner/fish-sandwich.jpg", "/images/Lunch/fish-sandwich-2.jpg",
				"/images/Lunch/fish-sandwich-3.jpg");
		Dinner chickenAndAvoSandwichD = new Dinner("Chicken & Avocado Sandwich",
				"Roasted Bell & Evans chicken, avocado, smoked gouda, roasted red peppers and greens with cayenne aioli + sweet potato fries.",
				"15", dinner, "/images/Dinner/chicken-and-avocado-sandwich.jpg",
				"/images/Lunch/chicken-and-avocado-sandwich-2.jpg", "/images/Lunch/chicken-and-avocado-sandwich-3.jpg");
		Dinner thaiburritoD = new Dinner("Thai Burrito",
				"Seared organic tofu or roasted chicken with peanut sauce, crunchy slaw and brown rice + tortilla chips & Thai dipping sauce.",
				"12.5", dinner, "/images/Dinner/thai-burrito.jpg", "/images/Lunch/thai-burrito-2.jpg",
				"/images/Lunch/thai-burrito-3.jpg");
		Dinner sweetBasilBurritoD = new Dinner("Sweet Basil Burrito",
				"Rotisserie roasted chicken or seared tofu with creamy pesto, sauteed veggies and brown rice + tortilla chips & Northstar's salsa",
				"13", dinner, "/images/Dinner/sweet-basil-burrito.jpg", "/images/Lunch/sweet-basil-burrito-2.jpg",
				"/images/Lunch/sweet-basil-burrito-3.jpg");
		Dinner spicyHarvestD = new Dinner("Spicy Harvest",
				"Smoked gouda, pepperoni, corn, jalapenos with organic tomato sauce on a whole wheat crust.", "14",
				dinner, "/images/Dinner/spicy-harvest-pizza.jpg", "/images/Lunch/spicy-harvest-pizza-2.jpg",
				"/images/Lunch/spicy-harvest-pizza-3.jpg");
		Dinner housemadeSausageD = new Dinner("Housemade Sausage",
				"Crumbled sausage and Mamma Lil's Peppers paired with organic tomato sauce, provolone and parmesan.",
				"14", dinner, "/images/Dinner/housemade-sausage-pizza.jpg",
				"/images/Lunch/housemade-sausage-pizza-2.jpg", "/images/Lunch/housemade-sausage-pizza-3.jpg");
		Dinner smokedGoudaAndChickenD = new Dinner("Smoked Gouda + Chicken",
				"Rotisserie roasted chicken, Northstar's BBQ sauce, red peppers, onions, cilantro and peanuts.", "14",
				dinner, "/images/Dinner/smoked-gouda-and-chicken-pizza.jpeg",
				"/images/Lunch/smoked-gouda-and-chicken-pizza-2.jpg",
				"/images/Lunch/smoked-gouda-and-chicken-pizza-3.jpg");
		Dinner highStreetVegetableD = new Dinner("High Street Vegetable",
				"Crunchy veggies, tomatoes, mushrooms, jalapenos, sunflower seeds, aged provolone and Grana Padano.",
				"12", dinner, "/images/Dinner/high-street-vegetable-pizza.jpeg",
				"/images/Lunch/high-street-vegetable-pizza-2.jpg", "/images/Lunch/high-street-vegetable-pizza-3.jpg");

		dinnerRepo.save(simpleSaladD);
		dinnerRepo.save(choppedSaladD);
		dinnerRepo.save(beechwoldSaladD);
		dinnerRepo.save(citrusCrunchSaladD);
		dinnerRepo.save(buddhaBowlD);
		dinnerRepo.save(squareMealD);
		dinnerRepo.save(northstarBurgerD);
		dinnerRepo.save(classicCheeseburgerD);
		dinnerRepo.save(fishSandwichD);
		dinnerRepo.save(chickenAndAvoSandwichD);
		dinnerRepo.save(thaiburritoD);
		dinnerRepo.save(sweetBasilBurritoD);
		dinnerRepo.save(spicyHarvestD);
		dinnerRepo.save(housemadeSausageD);
		dinnerRepo.save(smokedGoudaAndChickenD);
		dinnerRepo.save(highStreetVegetableD);

		// Alcoholic Bevs
		SampleMenu alcoholicBeverage = new SampleMenu();
		sampleMenuRepo.save(alcoholicBeverage);

		AlcoholicBeverage rhinegeistCougarBlondeAle = new AlcoholicBeverage("Rhinegeist Cougar Blonde Ale", "Ohio", "5",
				alcoholicBeverage, "/images/Drink/rhinegeist-cougar-blonde-ale.jpeg",
				"/images/Drink/rhinegeist-cougar-blonde-ale-2.jpg", "/images/Drink/rhinegeist-cougar-blonde-ale-3.jpg");
		AlcoholicBeverage northHighMilkStout = new AlcoholicBeverage("North High Milk Stout", "Ohio", "5",
				alcoholicBeverage, "/images/Drink/north-high-milk-stout.jpg",
				"/images/Drink/north-high-milk-stout-2.jpg", "/images/Drink/north-high-milk-stout-3.jpg");
		AlcoholicBeverage buehlerChardonnay = new AlcoholicBeverage("Buehler Chardonnay", "Napa", "9",
				alcoholicBeverage, "/images/Drink/buehler-chardonnay.jpeg", "/images/Drink/buehler-chardonnay-2.jpg",
				"/images/Drink/buehler-chardonnay-3.jpg");
		AlcoholicBeverage smithAndHookCabernet = new AlcoholicBeverage("Smith & Hook Cabernet", "Monterey", "10",
				alcoholicBeverage, "/images/Drink/smith-and-hook-cabernet.jpg",
				"/images/Drink/smith-and-hook-cabernet-2.jpg", "/images/Drink/smith-and-hook-cabernet-3.jpg");

		alcBevRepo.save(rhinegeistCougarBlondeAle);
		alcBevRepo.save(northHighMilkStout);
		alcBevRepo.save(buehlerChardonnay);
		alcBevRepo.save(smithAndHookCabernet);

		// Drinks
		SampleMenu drink = new SampleMenu();
		sampleMenuRepo.save(drink);

		Drink shootingStar = new Drink("Shooting Star", "5", drink, "/images/Drink/shooting-star.jpeg",
				"/images/Drink/shooting-star-2.jpg", "/images/Drink/shooting-star-3.jpg");
		Drink orangeJuice = new Drink("Orange Juice", "4.5", drink, "/images/Drink/orange-juice.jpeg",
				"/images/Drink/orange-juice-2.jpg", "/images/Drink/orange-juice-3.jpg");
		Drink organicCarrotJuice = new Drink("Organic Carrot Juice", "5", drink,
				"/images/Drink/organic-carrot-juice.jpeg", "/images/Drink/organic-carrot-juice-2.jpg",
				"/images/Drink/organic-carrot-juice-3.jpg");
		Drink strawberrySmoothie = new Drink("Strawberry Smoothie", "6", drink,
				"/images/Drink/strawberry-smoothie.jpeg", "/images/Drink/strawberry-smoothie-2.jpeg",
				"/images/Drink/strawberry-smoothie-3.jpeg");
		Drink blueberrySmoothie = new Drink("Blueberry Smoothie", "6", drink, "/images/Drink/blueberry-smoothie.jpeg",
				"/images/Drink/blueberry-smoothie-2.jpg", "/images/Drink/blueberry-smoothie-3.jpg");
		Drink gingerAle = new Drink("Ginger Ale", "4", drink, "/images/Drink/gingerale.jpg",
				"/images/Drink/gingerale-2.jpg", "/images/Drink/gingerale-3.jpg");
		Drink coldBrewedIcedCoffee = new Drink("Cold-Brewed Iced Coffee", "3.5", drink,
				"/images/Drink/cold-brewed-iced-coffee.jpeg", "/images/Drink/cold-brewed-iced-coffee-2.jpg",
				"/images/Drink/cold-brewed-iced-coffee-3.jpeg");
		Drink mintIcedCoffee = new Drink("Mint Iced Coffee", "4.5", drink, "/images/Drink/mint-iced-tea.jpeg",
				"/images/Drink/mint-iced-tea-2.jpg", "/images/Drink/mint-iced-tea-3.jpg");
		Drink singleOriginCoffee = new Drink("Single Origin Coffee", "3", drink,
				"/images/Drink/single-origin-coffee.jpeg", "/images/Drink/single-origin-coffee-2.jpg",
				"/images/Drink/single-origin-coffee-3.jpg");
		Drink hotTea = new Drink("Hot Tea", "3", drink, "/images/Drink/mint-iced-tea.jpeg",
				"/images/Drink/mint-iced-tea-2.jpg", "/images/Drink/mint-iced-tea-3.jpg");

		drinkRepo.save(shootingStar);
		drinkRepo.save(orangeJuice);
		drinkRepo.save(organicCarrotJuice);
		drinkRepo.save(strawberrySmoothie);
		drinkRepo.save(blueberrySmoothie);
		drinkRepo.save(gingerAle);
		drinkRepo.save(coldBrewedIcedCoffee);
		drinkRepo.save(mintIcedCoffee);
		drinkRepo.save(singleOriginCoffee);
		drinkRepo.save(hotTea);

		// Dessert
		SampleMenu dessert = new SampleMenu();
		sampleMenuRepo.save(dessert);

		Dessert peanutButterCookie = new Dessert("Peanut Butter Cookie", "3", dessert,
				"/images/Dessert/peanut-butter-cookie.jpeg", "/images/Dessert/peanut-butter-cookie-2.jpg",
				"/images/Dessert/peanut-butter-cookie-3.jpg");
		Dessert darkChocolateTruffleCookie = new Dessert("Dark Chocolate Truffle Cookie", "3", dessert,
				"/images/Dessert/dark-chocolate-truffle-cookie.jpg",
				"/images/Dessert/dark-chocolate-truffle-cookie-2.jpg",
				"/images/Dessert/dark-chocolate-truffle-cookie-3.jpg");

		dessertRepo.save(peanutButterCookie);
		dessertRepo.save(darkChocolateTruffleCookie);

		// Appetizer
		SampleMenu appetizer = new SampleMenu();
		sampleMenuRepo.save(appetizer);
		Appetizer pimientoCheeseDip = new Appetizer("Pimento Cheese Dip", "7", appetizer,
				"/images/Appetizer/pimiento-cheese-dip.jpeg", "/images/Appetizer/pimiento-cheese-dip-2.jpeg",
				"/images/Appetizer/pimiento-cheese-dip-3.jpeg");
		Appetizer madeToOrderGuacamole = new Appetizer("Made to Order Guacamole", "7", appetizer,
				"/images/Appetizer/made-to-order-guacamole.jpg", "/images/Appetizer/made-to-order-guacamole-2.jpg",
				"/images/Appetizer/made-to-order-guacamole-3.jpg");

		appetizerRepo.save(pimientoCheeseDip);
		appetizerRepo.save(madeToOrderGuacamole);
	}

}
