package PlayGround;

public class PhoneBookClass {
    private String password;
    private String name;
    private String phoneNumber;
    boolean isLocked = true;
    boolean isEmpty = true;
    public PhoneBookClass(String name, String password, String phoneNumber){
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    public String unlockedWith(String password){
        this.password = password;
        return password;
    }
    public boolean isEmpty() {
        return isEmpty;
    }

}
