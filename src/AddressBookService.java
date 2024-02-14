import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookService {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String Phno_Regex="^[6-9]{1}[0-9]{9}";
    private static final String Pin_Regex="^[0-9]{6}";
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
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(e);
        while(!matcher.matches()){
            System.out.println("Enter ur Email again");
            String z=sc.next();
            p.setEmail(z);
            matcher=pattern.matcher(z);

        }
        System.out.println("Enter phNo");
        String ph=sc.next();
        Pattern patterns = Pattern.compile(Phno_Regex);
        Matcher matchers = patterns.matcher(ph);
        while(!matchers.matches()){
            System.out.println("Enter ur phno again");
            String phone=sc.next();
            p.setEmail(phone);
            matchers=patterns.matcher(phone);

        }

        System.out.println("Enter Zip");
        String z=sc.next();
        Pattern patter = Pattern.compile(Pin_Regex);
        Matcher matche = patter.matcher(z);
        while(!matche.matches()){
            System.out.println("Enter ur pincode again");
            String pin=sc.next();
            p.setEmail(pin);
            matche=patter.matcher(pin);
        }


    }
    public void updateValue(Person p){
        Scanner sc= new Scanner(System.in);
        System.out.println("Update First name");
        String fn=sc.next();
        p.setFirstName(fn);
        System.out.println("Update Last name");
        String ln=sc.next();
        p.setLastName(ln);
        System.out.println("Update City name");
        String c=sc.next();
        p.setCity(c);
        System.out.println("Update State name");
        String s=sc.next();
        p.setState(s);
        System.out.println("Update Email");
        String e=sc.next();
        p.setEmail(e);
        System.out.println("Enter phNo");
        String ph=sc.nextLine();
        p.setPhNo(ph);
        System.out.println("Update Zip");
        String z=sc.nextLine();
        p.setZip(z);

    }

}
