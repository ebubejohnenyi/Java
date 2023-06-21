package PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBooks {
    private static PhoneBook newPhoneBook = new PhoneBook();
    private static List <PhoneBook> newPhoneBookList = new ArrayList<>();
    private static String id;

    public static void main(String[] args) {
        System.out.println(id);
    }
//    public static String getId() {
//        return id;
//    }
//    public void setId(String id, String phone) {
//        this.id = id;
//    }
//    public static String generateContactId(String holder){
//        id = String.valueOf(holder.length() * 2 % 10 + 1);
//        return id;
//    }
    public static void createPhoneBooks(String name, String phoneNumber){
        newPhoneBook.add(name,phoneNumber);
    }
    public static void readPhoneBook(String name){
        newPhoneBook.searchBy(name);
    }
    public static void updatePhoneBook(String name, String phoneNumber){
        for (PhoneBook phonebook : newPhoneBookList) {
            phonebook.add(name,phoneNumber);
        }
    }
    public static void deletePhoneBook(String name, String phoneNumber){
        for (PhoneBook newPhoneBooks: newPhoneBookList) {
            if(newPhoneBooks.equals(name)){
                newPhoneBooks.deleteContact(name);
            }
        }
    }
}
