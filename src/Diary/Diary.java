package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private boolean isUnlocked = true;
    private String password;
    private int counter;
    private String title;
    private String body;
    private String id;
    private List <Gists> newGists = new ArrayList<>();

    public Diary(String username, String password) {
        this.password = password;
    }
    public boolean isUnlocked() {
        return isUnlocked;
    }
    public boolean islocked() {
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
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void unlockedWith(String password) {
        if(password.equals(this.password)){
            isLocked = true;
        }
        else {
            System.out.println("Incorrect Password");
            isLocked = false;
        }
    }
    public void createEntry (String title, String body) {
        Gists newGists = new Gists(title,body);
        this.newGists.add(newGists);
        counter++;
    }
    public int getAddedEntry() {
        return newGists.size();
    }
    public int deleteEntry() {
        return counter--;
    }

    public Gists findMy_gistById(String Id){
        for (Gists gist : newGists) {
           if(gist.getTitle().equalsIgnoreCase(Id)){
               return gist;
           }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body){
        for (Gists gist : newGists) {
            if(gist.getTitle().equals(title)){
                gist.setTitle(title);
                gist.setId(id);
                gist.setBody(body);
            }
        }
    }

}
