package GlaTND;
import java.util.*;
public class ContactList {

        ArrayList number = new ArrayList();
        ArrayList fn = new ArrayList();
        ArrayList ln = new ArrayList();
        ArrayList email = new ArrayList();
        ArrayList number1 = new ArrayList();

        public void add() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the name of the Person");
            System.out.print("First Name: ");
            String firstname = sc.next();
            fn.add(firstname);
            System.out.print("Last Name: ");
            String lastname = sc.next();
            ln.add(lastname);
            System.out.print("Contact Number: ");
            String no = sc.next();
            number.add(no);
            System.out.print("Would you like to add another contact number? (y/n): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("y")) {
                System.out.print("Contact Number: ");
                String num = sc.next();
                number1.add(num);
            }
            else{
                number1.add("");
            }
            System.out.print("Would you like to add email address? (y/n): ");
            String eans = sc.next();
            if (eans.equalsIgnoreCase("y")) {
                System.out.print("Email Address: ");
                String emm = sc.next();
                email.add(emm);
            }
            else{
                email.add("");
            }

        }

        public void view() {
            System.out.println("\n---Here are all your contacts---");
            Iterator itr1 = fn.iterator();
            Iterator itr2 = ln.iterator();
            Iterator itr3 = number.iterator();
            Iterator itr4 = email.iterator();
            Iterator itr5 = number1.iterator();
            while (itr1.hasNext()) {
                System.out.println("-------- * -------- * -------- * --------");
                System.out.println("First Name:" + itr1.next());
                System.out.println("Last Name:" + itr2.next());
                System.out.print("Contact Number(s):" + itr3.next());
                System.out.print(", ");
                System.out.println(itr5.next());
                System.out.println("Email Address:" + itr4.next());
                System.out.println("-------- * -------- * -------- * --------");
            }
        }

        public void search() {
            int c = 0;
            System.out.print("You can search for a contact from their first names: ");
            Scanner sc = new Scanner(System.in);
            String search = sc.next();
            Iterator itr = fn.iterator();
            Iterator itr1 = fn.iterator();
            Iterator itr2 = ln.iterator();
            Iterator itr3 = number.iterator();
            Iterator itr4 = email.iterator();
            Iterator itr5 = number1.iterator();
            while (itr.hasNext()) {
                try{
                    String st = (String) itr1.next();
                    int index=fn.indexOf(st);

                    if (st.equalsIgnoreCase(search)) {
                        c++;
                        System.out.println(c + " Match Found!");
                        System.out.println("-------- * -------- * -------- * --------");
                        System.out.println("First Name:" + fn.get(index));
                        System.out.println("Last Name:" + ln.get(index));
                        System.out.print("Contact Number(s):" + number.get(index));
                        if(number1.get(index).equals("")){
                            System.out.print(" ");
                        }else{
                            System.out.print(", ");
                        }
                        System.out.println(number1.get(index));
                        System.out.println("Email Address:" + email.get(index));
                        System.out.println("-------- * -------- * -------- * --------");

                    }
                    else{
                        System.out.println("NO RESULTS FOUND!");
                    }
                }
                catch(Exception e)
                {
                    break;
                }

            }

        }


        public void delete()
        {
            int i=1;
            System.out.println("Here are all your contacts: ");
            Iterator itr = fn.iterator();
            Iterator itr1 = fn.iterator();
            Iterator itr2 = ln.iterator();
            Iterator itr3 = number.iterator();
            Iterator itr4 = email.iterator();
            Iterator itr5 = number1.iterator();
            while (itr1.hasNext()) {
                System.out.println(i+". " + itr1.next());
                i++;
            }
            System.out.print("Press the number against the contact to delete it: ");
            Scanner sc = new Scanner(System.in);
            int search = sc.nextInt();
            System.out.println(fn.get(search-1)+"'s contact deleted from list!");
            fn.remove(search-1);
            ln.remove(search-1);
            number.remove(search-1);
            email.remove(search-1);
            number1.remove(search-1);

        }
    }
