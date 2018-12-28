import java.util.Scanner;



public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("123 485 4477");
	   
	   public static void main(String[] args) {
		   
		   boolean quit = false;
		   startPhone();
		   printActions();
		   while (!quit){
			   System.out.println("\nEnter action [0-6 available actions]");
			   int action = scanner.nextInt();
			   scanner.nextLine();
			   
			   // While cases
			   switch(action){
			   case 0:
				   System.out.println("\n Shutting down ...");
				   quit = true;
				   break;
			   case 1:
				   mobilePhone.printContacts();
				   break;
			   case 2:
				   addNewContact();
				   break;
			   case 3:
				   updateContact();
				   break;
			   case 4:
				   removeContact();
				   break;
			   case 5:
				   queryContact();
				   break;
			   case 6:
				   printActions();
				   break;
			   }
			   
		   }
	   }
	   
	   private static void addNewContact(){
		   System.out.println("Enter new contact name : ");
		   String name = scanner.nextLine();
		   System.out.println("Enter phone number: ");
		   String phone = scanner.nextLine();
		   Contact newContact = Contact.createContact(name, phone);
		   
		   if (mobilePhone.addNewContact(newContact)){
			  System.out.println("New contact addes: name = " + name + ", phine = " + phone); 
		   } else {
			   System.out.println("Cannot add, " + name + " already on file!");
		   }
		   
	   }
	   
	   private static void updateContact(){
		   System.out.println("Enter existing contact name: ");
		   String name = scanner.nextLine();
		   Contact existingContactRecord = mobilePhone.queryContact(name);
		   if (existingContactRecord == null){
			   System.out.println("Contact not found!");
			   return;
		   }
		   
		   System.out.println("Enter new contact name: ");
		   String newName = scanner.nextLine();
		   System.out.println("Enter new contact phone nmaber: ");
		   String newNumber = scanner.nextLine();
		   Contact newContact = Contact.createContact(newName, newNumber);
		   
		   if (mobilePhone.updateContact(existingContactRecord, newContact)){
			   System.out.println("Successfully update contact!");
		   } else {
			   System.out.println("Error updating conatct!");
		   }
		}
	   
	   private static void removeContact(){
		   System.out.println("Enter existing contact name: ");
		   String name = scanner.nextLine();
		   Contact existingContactRecord = mobilePhone.queryContact(name);
		   if (existingContactRecord == null){
			   System.out.println("Contact not found!");
			   return;
		   }
		   
		  if ( mobilePhone.removeContact(existingContactRecord)){
			   System.out.println("Enter existing conatct name: ");   
		   } else {
			   System.out.println("Error deleting conatct!");
		   }
	   }
	   
	   private static void queryContact(){
		   System.out.println("Enter existing contact name: ");
		   String name = scanner.nextLine();
		   Contact existingContactRecord = mobilePhone.queryContact(name);
		   if (existingContactRecord == null){
			   System.out.println("Contact not found!");
			   return;
		   }
		   System.out.println("Name: " + existingContactRecord.getName() + "phone number is " + existingContactRecord.phoneNumber());
	   }
	   
	   private static void startPhone(){
	         System.out.println("Starting Phone ...ON");
	     }
	   
	   private static void printActions(){
	         System.out.println("\n Avialable action:\n press");
	         System.out.println("0 - to Shutdown Program\n" +
	        		 			"1 - To Print conatcts\n" + 
	        		 			"2 - To Add a New conatct\n" + 
	        		 			"3 - To Update an existing conatcts\n" + 
	        		 			"4 - To Remove an existing conatct\n" + 
	        		 			"5 - Query if an existing conatct exists\n" + 
	        		 			"6 - To Print a list of available action\n" + 
	        		 			"Please choose your action: ");
	     }
	   
	   private static void addNewConatct(){
		   System.out.println("Enter new conact name: ");
		   String name = scanner.nextLine();
		   System.out.println("Enter Phone Number: ");
		   String phoneNumber = scanner.nextLine();
		   
		   Contact newConatct = Contact.createContact(name, phoneNumber);
		   if (mobilePhone.addNewContact(newConatct)){
			   System.out.println("New conatct Added: name = " + name + ", Phone number = " + phoneNumber );
		   } else {
			   System.out.println("Conatact cannot be added. " + name + "already exist on conatct list.");
		   }
	   }
	
}
