import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer("Abe", 3934.22);
		Customer customer2;
		
		customer2 = customer1;
		customer2.setBalance(2322.22);
		System.out.println("Balance for Customer1:  " + customer1.getName() + " is $"+ customer1.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));		
		}
		
		intList.add(1, 2);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));		
		}
	}

}
