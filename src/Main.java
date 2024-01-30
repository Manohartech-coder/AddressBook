public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Person p1= new Person();
        AddressBookService s= new AddressBookService();
        s.setValue(p1);
        System.out.println(s.display(p1));
        AdressBookRec r1=new AdressBookRec();
        r1.book.put(1,p1);
        System.out.println(r1.book.toString());
        r1.editC("Manu");
        System.out.println(r1.book.toString());
        r1.deleteC("Manu");
        System.out.println(r1.book.toString());
    }
}