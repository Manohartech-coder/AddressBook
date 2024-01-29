import java.util.*;

public class AdressBookRec {

    HashMap<Integer,Person> book= new HashMap<Integer,Person>();


    public void editC(String name){
        for(Map.Entry<Integer,Person> e: book.entrySet() ){
            int key=e.getKey();
            Person pe=e.getValue();
            String s= pe.getFirstName();
            if(s.equalsIgnoreCase(name)){
                AddressBookService ae= new AddressBookService();
                ae.updateValue(pe);
                book.replace(key,pe);
            }
        }
    }

}
