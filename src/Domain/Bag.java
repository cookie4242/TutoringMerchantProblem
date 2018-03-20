package Domain;

import java.util.ArrayList;

public class Bag {
	public int Width = 4;
	public int Height = 4;
	public Boolean Goucci = false;
	public ArrayList<Item> Contents;
	public double cost = 12345;
	
	public Bag() {
		Contents = new ArrayList<Item>();
		CreateItem("Penguin", 504.22);
		CreateItem("Deodorant", 3.99);
		CreateItem("A funny hat", 10333.44);
		CreateItem("Oats", 33);
		CreateItem("Elbow Grease", 1.01);
		CreateItem("Three baby carrots", 1000321);
		CreateItem("A Tornado", 750.11);
	}
	
	private void CreateItem(String name, double value) {
		Item item = new Item();
		item.Name = name;
		item.Value = value;
		Contents.add(item);
	}
}
