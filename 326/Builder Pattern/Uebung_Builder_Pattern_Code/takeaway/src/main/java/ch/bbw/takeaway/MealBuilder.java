package ch.bbw.takeaway;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

	public Meal prepareWaterDoppelBurger() {
		Meal meal = new Meal();
		meal.addItem(new Doppelburger());
		meal.addItem(new Water());
		return meal;
	}

	public Meal prepareKidMenu() {
		Meal meal = new Meal();
		meal.addItem(new Cheeseburger());
		meal.addItem(new Pommes());
		meal.addItem(new AquamanToy());
		meal.addItem(new Pepsi());
		return meal;
	}



}