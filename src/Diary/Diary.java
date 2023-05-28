package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private int counter;
    private String title;
    private String body;
    private List <Gists> newGistGists = new ArrayList<>();

    public Diary(String username, String password) {
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setBody(String body){
        this.body = body;
    }
    public  String getBody(){
        return body;
    }
    public void unlockedWith(String password) {
        if(password.equals(this.password)){
            System.out.println("Password is correct");
            isLocked = true;
        }
        else {
            System.out.println("Incorrect Password");
            isLocked = false;
        }
    }
    public void createEntry(int id, String title, String body) {
        Gists newGists = new Gists(id,title,body);
        newGistGists.add(newGists);
        counter++;
    }
    public int getAddedEntry() {
        return newGistGists.size();
    }
    public int deleteEntry() {
        return newGistGists.size();
    }

    public Object findMy_gistById(int id){
        for (Gists gist : newGistGists) {
            if(gist.equals(getId())){
                return id;
            }
        }
        return null;
    }

    private Gists getId() {
        return Gists;
    }

}
