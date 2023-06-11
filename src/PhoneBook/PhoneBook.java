package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private boolean isEmpty = true;
    private int phoneBookSize;
    private List <Contacts> phoneBookList = new ArrayList<>();
    public boolean isEmpty() {
        return isEmpty;
    }
    public void add(String name, String phoneNumber) {
        Contacts contacts = new Contacts(name,phoneNumber);
        this.phoneBookList.add(contacts);
    }
    public int phoneBookSize() {
        phoneBookSize = phoneBookList.size();
        return phoneBookSize;
    }

    public Contacts deleteByName(String name) {
        for (Contacts newContacts : phoneBookList) {
            if(newContacts.getName().equalsIgnoreCase(name)){
                phoneBookList.remove(newContacts);
                break;
            }
        }
        return null;
    }

    public String searchBy(String name) {
        for (Contacts newContacts : phoneBookList) {
            if(newContacts.getName().equalsIgnoreCase(name)){
                return name;
            }
        }
        return "NAME DOES'NT EXIST";
    }
    public void deleteAll() {
        phoneBookList.clear();
    }
}
