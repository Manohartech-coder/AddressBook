import java.util.*;

public class AdressBookRec {

    HashMap<Integer,Person> book= new HashMap<Integer,Person>();

    public void addPerson(int id, Person person){
        book.put(id,person);
    }

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
    public void deleteC(String name){
        Iterator<Map.Entry<Integer, Person>> iterator = book.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            Person person = entry.getValue();

            if (person.getFirstName().equals(name)) {
                iterator.remove();
            }
        }

    }

}
