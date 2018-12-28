
public class Main {
	public static void main(String[] args) {
		
		//========================================= Account  =================================================	
		// Call Methods
		Account absAccount = new Account("12345",0.00, "Abe Tesfay", "email@abe.com","(408) 123-4567");
		System.out.println("Customer Account Number : " +absAccount.getNumber());
		System.out.println("   Name : " +absAccount.getCustomerName());
		System.out.println("   email Address : " +absAccount.getCustomerEmailAddress());
		System.out.println("   Phone Number : " +absAccount.getCustomerPhoneNumber());
		System.out.println("   Account Balance : " +absAccount.getBalance());
		absAccount.withdrawal(100.0);
		
		absAccount.deposit(50.0);
		absAccount.withdrawal(100.0);
		
		absAccount.deposit(51.0);
		absAccount.withdrawal(100.0);
		
		Account timAccount = new Account("Tim", "tim@email.com","(408)1231234");
		System.out.println("Account number: " + timAccount.getNumber() + " Account name: " + timAccount.getCustomerName() );
		
	
		System.out.print("\n");
		//========================================= VipPerson  =================================================		
		System.out.println("============= VipPerson Class Start here! ================");
		System.out.print("\n");
		VipPerson person1 = new VipPerson();
		System.out.println("Name: " + person1.getName());
		System.out.println("Email: " + person1.getEmailAddress());
		System.out.println("Credit limit: " + person1.getCreditLimit());
		System.out.print("\n");
		VipPerson person2 = new VipPerson("Bob",25000.00);
		System.out.println("Name: " + person2.getName());
		System.out.println("Email: " + person2.getEmailAddress());
		System.out.println("Credit limit: " + person2.getCreditLimit());
		System.out.print("\n");
		VipPerson person3 = new VipPerson("Tim",10000.00,"timemail@email.com");
		System.out.println("Name: " + person3.getName());
		System.out.println("Email: " + person3.getEmailAddress());
		System.out.println("Credit limit: " + person3.getCreditLimit());
		
		
	}

}
