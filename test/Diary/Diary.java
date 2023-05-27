package Diary;

public class Diary {
    private boolean isLocked = true;
    private String password;

    public Diary(String username, String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockedWith(String password) {
        isLocked = false;
        if(password.equals(this.password));
    }
}
