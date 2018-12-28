
public class VipPerson {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	
	
	public VipPerson() {
		//super();
		this("Default name",5000.00, "default@email.com");
	}




	public VipPerson(String name, double creditLimit) {
		//super();
		this(name, creditLimit,"unknown@email.com");
	}

	public VipPerson(String name, double creditLimit, String emailAddress) {
		//super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}


	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	

}
