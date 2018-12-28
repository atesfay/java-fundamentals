
public class Main {
	
	public static void main(String[] args) {
		Bank bankCA = new Bank("Bank of America CA");
		
		if(bankCA.addBranch("Santa Clara")){
			System.out.println("Santa Clara branch created!");
		}
		
		bankCA.addBranch("San Jose");
		bankCA.addCustomer("San Jose", "Abraham", 5000.00);
		bankCA.addCustomer("San Jose", "Dave", 3500.00);
		bankCA.addCustomer("San Jose", "Elias", 3100.00);
		bankCA.addCustomer("San Jose", "Micheal", 1500.00);
		bankCA.addCustomer("San Jose", "Mary", 700.00);
		
		bankCA.addBranch("Cupertino");
		bankCA.addCustomer("Cupertino", "Matt", 11000.00);
		bankCA.addCustomer("Cupertino", "Bereket", 3500.00);
		bankCA.addCustomer("Cupertino", "Elias", 3100.00);
		bankCA.addCustomer("Cupertino", "Micheal", 1500.00);
		bankCA.addCustomer("Cupertino", "Mary", 700.00);
		
		
		bankCA.addCustmerTransaction("San Jose", "Abraham", 1200.00);
		bankCA.addCustmerTransaction("San Jose", "Elias", 3100.00);
		bankCA.addCustmerTransaction("Cupertino", "Bereket", 4321.00);
		bankCA.addCustmerTransaction("Cupertino", "Mary", 63700.00);
		
		bankCA.listCustomers("San Jose", true);
		bankCA.listCustomers("Cupertino", true);
		
		bankCA.addBranch("Campbell");
		if(!bankCA.addCustomer("Campbell", "Brian", 1367.67)){
			System.out.println("Error Campbell branch doeas not exist!");
		}
		
		if (!bankCA.addBranch("San Jose")){
			System.out.println("Error this branch already exist!");
		}
		
		if(!bankCA.addCustmerTransaction("San Jose", "Jill", 38738.22)){
			System.out.println("Error customer doeas not exist in this branch!");
		}
		
		if(!bankCA.addCustomer("San Jose", "Dave", 38738.22)){
			System.out.println("Customer already exist in this branch!");
		}
	}

}
