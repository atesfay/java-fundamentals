import java.util.Scanner;


public class ListAndArrayList {
	
	private static Scanner scanner = new Scanner(System.in); 
	private static GroceryList groceryList = new GroceryList();
	
	//private static int[] baseData = new int[10];	
	
	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		printInstruction();
		
		// while
		while(!quit){
			System.out.println("\nPlease enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
			case 0:
				printInstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchforItem();
				break;
			case 6:
				quit = true;
				break;
			}
			
			
		}
		
//		System.out.println("Enter 10 integers: ");
//		getInput();
//		printArray(baseData);
//		
//		resizeArray();
//		
//		System.out.println("Enter 12 integers: ");
//		getInput();
//		printArray(baseData);
		
	}
	
	// printInstruction will print instruction 
	public static void printInstruction(){
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print chioce option.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To Add an item to grocery list.");
		System.out.println("\t 3 - To Modify an item  from the grocery list.");
		System.out.println("\t 4 - To Remove an item  from the grocery list.");
		System.out.println("\t 5 - To Search an item  from the grocery list.");
		System.out.println("\t 6 - To Quit the Appliction.");
	}
	
	// will Add an Item to the list
	public static void addItem(){
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());		
	}
	
	// will modify Grocery List
	public static void modifyItem(){
		System.out.println("Please enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	
	// will remove an item
	public static void removeItem(){
		System.out.println("Please enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);;
	}
	
	// will search for an item in Gricery list
	public static void searchforItem(){
		System.out.println("Please enter item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.findItem(searchItem) != null){
			System.out.println("Found " + searchItem + " in grocery list ");
		}else {
			System.err.println(searchItem + " is not found in the grocery list!");
		}
	}
//	private static void getInput(){
//		for (int i = 0; i < baseData.length; i++) {
//			baseData[i] = s.nextInt();
//		}
//	}
//	
//	private static void printArray(int[] arr){
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		System.out.println();
//		}
//	}
//	
//	private static void resizeArray(){
//		int[] orginal = baseData;
//		
//		baseData = new int[12];
//		for (int i = 0; i < orginal.length; i++) {
//			baseData[i] = orginal[i];
//		}
//	}
}
