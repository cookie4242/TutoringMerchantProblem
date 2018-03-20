package Domain;

public class Merchant {
	public Bag Bag;
	public Item Shoes = new Item();
	public Item Wallet = new Item();
	
	public Merchant()
	{
		Bag = new Bag();
	}
}
