package GlaTND;

import java.util.*;

public class Implementation extends ContactList{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactList obj = new ContactList();
        for (int j=1;;j++) {
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("Welcome to Manish Gautam's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");


            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have chosen to add a new contact: ");
                    System.out.println("Enter Number of Contacts you want to Add : ");
                    int n = scan.nextInt();
                    for (int i = 1; i <= n; i++) {
                        obj.add();
                    }
                    break;
                case 2:
                    obj.view();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input...! Kindly Input Again");
                    break;
            }
        }
    }
}
