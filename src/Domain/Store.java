package Domain;

public class Store {
	public String Name;
	public int NumberOfBurgers = 0;
	public Merchant Merchant;
	public Item Heater = new Item();
	
	public Store()
	{
		Merchant = new Merchant();
	}
}
