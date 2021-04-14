package ch.bbw.takeaway;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {
	public static void main(String[] args) {
		

		MealBuilder mealBuilder = new MealBuilder();

		Meal meal1 = mealBuilder.prepareNonVegMeal();
		Meal meal2 = mealBuilder.prepareVegMeal();
		Meal meal3 = mealBuilder.prepareWaterDoppelBurger();
		Meal meal4 = mealBuilder.prepareKidMenu();


		meal1.showItems();
		meal1.getCost();

		meal2.showItems();
		meal2.getCost();

		meal3.showItems();
		meal3.getCost();

		meal4.showItems();
		meal4.getCost();

		List<Meal> meals = new ArrayList<>();
		meals.add(meal1);
		meals.add(meal2);
		meals.add(meal3);
		meals.add(meal4);
		meals.forEach(meal -> meal.showItems());

		List<Packing> allPackages = meals.stream()
				.flatMap(meal -> meal.getItems().stream())
				.map(i -> i.packing())
				.collect(Collectors.toList());

		allPackages.stream()
				.map(p -> p.pack())
				.distinct()
				.forEach(System.out::println);
	}
}