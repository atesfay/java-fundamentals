import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;




public class Demo {
	public static void main(String[] args) {
		
		LinkedList<String> placeToVist = new LinkedList<String>();
		
		placeToVist.add("Egyept");
		placeToVist.add("Rome");
		placeToVist.add("Paris");
		placeToVist.add("Isreal");
		placeToVist.add("Kenya");
		placeToVist.add("Ethiopia");
		placeToVist.add("Malesia");
		
		printList(placeToVist);
		
		placeToVist.add(1, "London");
		
		System.out.println("Remove --> index[4] = " + placeToVist.get(4));	
		System.out.println("============================");
		placeToVist.remove(4);
		printList(placeToVist);
		
		addInOrder(placeToVist, "Egyept");
		addInOrder(placeToVist, "Rome");
		addInOrder(placeToVist, "Paris");
		addInOrder(placeToVist, "Isreal");
		addInOrder(placeToVist, "Kenya");
		addInOrder(placeToVist, "Ethiopia");
		addInOrder(placeToVist, "Malesia");
		
		addInOrder(placeToVist, "Addis Abeba");
		addInOrder(placeToVist, "Denmark");
		printList(placeToVist);
		visitPlace(placeToVist);
	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visting " + i.next());			
		}
		System.out.println("============================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			if (comparison == 0 ){
				// equal, do not add
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if (comparison > 0){
				// newCity should appear before this one 
				// Brisbane -> Adelaide
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0){
				// move to the next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visitPlace(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.getFirst() == ""){
			System.out.println("No such cities in the iteneray! ");
			return;
		} else{
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("Holiday / vaction over");
				quit = true;
				break;
			
			case 1:
				if (!goingForward){
					if (listIterator.hasNext()){
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()){
					System.out.println("Now visiting " + listIterator.next());
				} else {
					System.out.println("Reached the end of the list ");
				}
				break;
				
			case 2:
				if (goingForward){
					if (listIterator.hasPrevious()){
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()){
					System.out.println("Now visting " + listIterator.previous());
				} else {
					System.out.println("We are at the start of the list");
				}
				break;
			
			case 3:
				printMenu();
			
			}
		}
		

	}
	
	private static void printMenu(){
		System.out.println("Available action: \npress ");
		System.out.println("0 - to quit\n" + 
		"1 - to go next city\n" +
		"2 - to go to previous city\n" +
		"3 - to print menu options");
		
	}
		

}
