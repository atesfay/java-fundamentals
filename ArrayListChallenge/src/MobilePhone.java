import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String myNumber){
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
    }
    
    public boolean addNewContact(Contact newContact){
        
        if (findContact(newContact.getName()) >= 0){
            System.out.println("Contact name already on file!");
            return false;
        }
        // update newConatct
        myContacts.add(newContact);
        return true;
    }
    
    // This method will update the new contact list
    public boolean updateContact( Contact oldContact, Contact newContact){
        int foundPostion = findContact(oldContact);
        if(foundPostion < 0){
            System.out.println(oldContact.getName()+", was not found. ");
            return false;
        } else if(findContact(newContact.getName()) != -1){
        	System.out.println("Contact with name " + newContact.getName() + " already exist. Update was not successful!");
        	return false;
        }
        
        this.myContacts.set(foundPostion, newContact);
        System.out.println(oldContact.getName()+", was replaced with " + newContact.getName());
        return true;
    }
    
    private int findContact(Contact xContact){
        return this.myContacts.indexOf(xContact);
    }
    
    private int findContact(String contactName){
        for (int i=0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return 1;
            }
        }
        return -1;
    }
    
    // Remove Contact
    public boolean removeContact(Contact contact){
        int foundPostion = findContact(contact);
        if(foundPostion < 0){
            System.out.println(contact.getName()+", was not found. ");
            return false;
        }
        this.myContacts.remove(foundPostion);
        System.out.println(contact.getName()+", is removed.");
        return true;
    }
    
    // This method will do query finder 
    
    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null; 
    }
    
    public Contact queryContact(String name){
    	int postion = findContact(name);
    	if (postion >= 0){
    		return this.myContacts.get(postion);
    	}
    	return null;
    }

	public void printContacts() {
		System.out.println("Contact List ");
		for (int i = 0; i < this.myContacts.size(); i++) {
			System.out.println((i+1) + "." + 
						this.myContacts.get(i).getName() + " -> " + 
						this.myContacts.get(i).phoneNumber());
		}
	}

}
