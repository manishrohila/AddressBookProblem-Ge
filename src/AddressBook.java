import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void addContact(Contact c1){
        adBook.add(c1);
        System.out.println("contact is added");
    }
    public void display(){
        System.out.println(adBook);
    }

    public void editContact(String name){
        for (Contact contact : adBook){
            if(contact.firstName.equalsIgnoreCase(name)){
                System.out.println("Contact found "+ contact);
                updateContact(contact);
                return ;
            }
        }
        System.out.println("Contact with the name "+ name + "not found");
    }
    private void updateContact(Contact contact){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new name ");
        String fname = sc.nextLine();
        if(!fname.isEmpty()) contact.firstName = fname;

        System.out.println("Enter new Last Name (or press Enter to keep " + contact.lastName + "):");
        String lname = sc.nextLine();
        if (!lname.isEmpty()) contact.lastName = lname;

        System.out.println("Enter new City (or press Enter to keep " + contact.city + "):");
        String city = sc.nextLine();
        if (!city.isEmpty()) contact.city = city;

        System.out.println("Enter new State (or press Enter to keep " + contact.state + "):");
        String state = sc.nextLine();
        if (!state.isEmpty()) contact.state = state;

        System.out.println("Enter new Email (or press Enter to keep " + contact.email + "):");
        String email = sc.nextLine();
        if (!email.isEmpty()) contact.email = email;

        System.out.println("Enter new Phone (or press Enter to keep " + contact.phone + "):");
        String phone = sc.nextLine();
        if (!phone.isEmpty()) contact.phone = Integer.parseInt(phone);

        System.out.println("Enter new Zip (or press Enter to keep " + contact.zip + "):");
        String zip = sc.nextLine();
        if (!zip.isEmpty()) contact.zip = Integer.parseInt(zip);

        System.out.println("Contact updated successfully!");

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
