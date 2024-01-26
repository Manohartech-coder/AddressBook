public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Person p1= new Person();
        AddressBookService s= new AddressBookService();
        s.setValue(p1);
        System.out.println(s.display(p1));

    }
}