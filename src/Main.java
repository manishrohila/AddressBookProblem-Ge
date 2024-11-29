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
           System.out.println("Enter to 1 to create Contact \nEnter 2 to display A1 contacts  ");
           int input = sc.nextInt();
            switch (input) {
                case 1:
                    createcontact(A1);
                    break;
                case 2:
                    A1.display();
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
    static void createcontact(AddressBook a1){
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
        a1.addContact(c1);
    }
}