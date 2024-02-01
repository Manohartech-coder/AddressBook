import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");


        AddressBookService s= new AddressBookService();
        AdressBookRec r=new AdressBookRec();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for that many contacts adding: ");
        int noOf=sc.nextInt();
        for(int i=1;i<=noOf;i++){
            Person p= new Person();
            s.setValue(p);
            r.addPerson(i,p);
        }
        System.out.println("Printing current available records"+r.book.toString());
        System.out.println("enter a First name to edit contact");
        String refName=sc.next();
        r.editC(refName);
        System.out.println("After editing contact"+r.book.toString());
        System.out.println("enter a First name to delete contact");
        String defName=sc.next();
        r.deleteC(defName);
        System.out.println("After deleting a contact"+r.book.toString());
    }
}