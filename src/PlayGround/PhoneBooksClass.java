package PlayGround;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooksClass {
    private String name;
    private String phoneNumber;
    private boolean isUnlocked = true;
    private static List <PhoneBookClass> phoneBookClassList = new ArrayList<>();
    private static final List <String> allPassword = new ArrayList<>();
    public void createPhoneBook(String name, String password, String phoneNumber){
        PhoneBookClass newPhoneBook = new PhoneBookClass(name, password, phoneNumber);
        phoneBookClassList.add(newPhoneBook);
        allPassword.add(password);
    }
    public int getAllPhoneBook(){
            return phoneBookClassList.size();
    }
    public boolean unLockAll() {
        for (PhoneBookClass newPhoneBook: phoneBookClassList) {
            newPhoneBook.unlockedWith("password");
            return isUnlocked;
        }
        return false;
    }
}
