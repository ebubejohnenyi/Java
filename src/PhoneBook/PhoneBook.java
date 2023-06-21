package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private static Contacts contacts = new Contacts("Ebube","09054498013");
    private boolean isEmpty = true;
    private int phoneBookSize;
    private List <Contacts> phoneBookList = new ArrayList<>();
    private String myContact; 
    public boolean isEmpty() {
        return isEmpty;
    }
    public void add(String name, String phoneNumber) {
        Contacts contacts = new Contacts(name,phoneNumber);
        phoneBookList.add(contacts);
    }
    public int phoneBookSize() {
        phoneBookSize = phoneBookList.size();
        return phoneBookSize;
    }

    public void deleteContact(String name) {
        for (Contacts newContacts : phoneBookList) {
            if(newContacts.getName().equalsIgnoreCase(name)){
                phoneBookList.remove(newContacts);
                break;
            }
        }
    }
    public String searchBy(String name) {
        for (Contacts newContacts : phoneBookList) {
            if(newContacts.getName().equalsIgnoreCase(name)){
                return contacts.getPhoneNumber();
            }
        }
        return "NAME DOES'NT EXIST";
    }
    public void deleteAll() {
        phoneBookList.clear();
    }

    public String viewAllAddedContact() {
        for (Contacts allContacts: phoneBookList) {
           myContact = String.valueOf(allContacts);
            System.out.println(myContact);
        }
        return myContact;
    }
}
