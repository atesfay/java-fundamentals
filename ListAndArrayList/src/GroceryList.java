import java.util.ArrayList;


public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	// Add Grocery Item
	public void addGroceryItem(String item){
		groceryList.add(item);
	}
	
	// Print Grocery List
	public void printGroceryList(){
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	// modify Grocery LIst
	public void modifyGroceryItem(int position, String newItem){
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1 + " has been modified."));
	}
	
	// Remove an item from Grocery List 
	public void removeGroceryItem(int position){
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	// find item from Grocery list
	public String findItem(String searchItem){
		//boolean exists = groceryList.contains(searchItem);
		
		int position = groceryList.indexOf(searchItem);
		if(position >= 0){
			return groceryList.get(position);
		}
		return null;
	}
}
