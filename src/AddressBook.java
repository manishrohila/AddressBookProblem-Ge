import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void addContact(Contact c1){
        adBook.add(c1);
        System.out.println("contact is added");
    }
    public void display(){
        System.out.println(adBook);
    }
    public void editContact(){

    }
    public  void deleteContact (String name){
        boolean removed = adBook.removeIf(contact -> contact.firstName.equalsIgnoreCase(name));
        if(removed){
            System.out.println("Contact is Deleted ");
        }
        else {
            System.out.println("contact not found");
        }
    }
}
