import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       AddressBook A1 = new AddressBook();
       int i =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to address Book ");
        do {
           System.out.println("Enter to 1 to create Contact \nEnter 2 to display A1 contacts" +
                   "\nEnter 3 to edit the contact \nEnter 4 to Delete the Contact  ");
           int input = sc.nextInt();
            switch (input) {
                case 1:
                    createcontact(A1);
                    break;
                case 2:
                    A1.display();
                    break;
                case 3:
                    editContact(A1);
                    break;
                case 4:
                    deleteContact(A1);
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }

            System.out.println("Enter 0 to exit\nTo continue press 1 ");
           i = sc.nextInt();
         }while (i!=0);
        System.out.println("Thank you for using the address book");
        sc.close();
    }
    static void createcontact(AddressBook A1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String fname = sc.next();
        System.out.println("Enter Last Name ");
        String lname = sc.next();
        System.out.println("Enter city ");
        String city = sc.next();
        System.out.println("Enter state ");
        String state = sc.next();
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter phone ");
        int phone = sc.nextInt();
        System.out.println("Enter zip ");
        int zip = sc.nextInt();
        Contact c1 = new Contact(fname,lname, city,state,email,phone,zip);
        A1.addContact(c1);
    }
    static  void editContact(AddressBook A1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name to edit the contact details ");
        String name = sc.next();
        A1.editContact(name);

    }
    static void deleteContact(AddressBook A1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to delete");
        String name= sc.next();
        A1.deleteContact(name);

    }
}