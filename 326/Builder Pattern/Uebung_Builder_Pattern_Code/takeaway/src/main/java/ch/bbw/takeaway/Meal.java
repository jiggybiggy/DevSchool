package ch.bbw.takeaway;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		items.forEach(item -> {
			System.out.println(item.name() + " - " + item.price() + " - " + item.packing().pack());
		});
	}

	public List<Item> getItems() {
		return items;
	}
}