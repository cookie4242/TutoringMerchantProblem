import Domain.Item;
import Domain.Store;

public class Program 
{
	public static void main(String[] args) 
	{
		//Create a new Store object and figure out the most expensive item in the 
		//stores Contents, wherever that may be...
		Store IDK= new Store();
		System.out.println(IDK.Heater.Value);
		System.out.println("bag worth = " + IDK.Merchant.Bag.cost);
		//System.out.println(IDK.Merchant.Bag.Contents);
		Item i  = new Item();
		
		for(Item bagStuff : IDK.Merchant.Bag.Contents)
		{
			System.out.println(bagStuff.Name + " " + bagStuff.Value);
			if (bagStuff.Value > i.Value)
				i = bagStuff;
		}
		
		System.out.println("AND THE MOST VALUABLE THING IN THE BAG IS " + i.Name + " GOING FOR " + i.Value);
	}
}
