import java.util.*;
public class AddressBookService {
    public String display(Person p){
        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+p.getEmail()+" "+p.getPhNo()+" "+p.getZip();
    }
    public void setValue(Person p){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First name");
        String fn=sc.next();
        p.setFirstName(fn);
        System.out.println("Enter Last name");
        String ln=sc.next();
        p.setLastName(ln);
        System.out.println("Enter City name");
        String c=sc.next();
        p.setCity(c);
        System.out.println("Enter State name");
        String s=sc.next();
        p.setState(s);
        System.out.println("Enter Email");
        String e=sc.next();
        p.setEmail(e);
        System.out.println("Enter phNo");
        int ph=sc.nextInt();
        p.setPhNo(ph);
        System.out.println("Enter Zip");
        int z=sc.nextInt();
        p.setZip(z);

    }
}
