package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true, isUnlocked = true;
    private String password, username, title, body, id;
    private List <Gists> newGistsList = new ArrayList<>();
    public Diary(String username, String password) {
        this.password = password;
        this.username = username;
    }
    public boolean isUnlocked() {
        return isUnlocked;
    }
    public boolean islocked() {
        return isLocked;
    }
    public boolean unlockedWith(String password) {
        if(this.password.equals(password)){
            return isUnlocked;
        }
        else {
            System.out.println("Incorrect Password");
            return isLocked;
        }
    }
    public void createNewGist(String title, String body) {
        Gists newGists = new Gists(title,body);
        newGists.setId(newGistsList.size() + 1);
        newGistsList.add(newGists);
    }
    public int getAllGists() {
        return newGistsList.size();
    }
    public void deleteGist_ByTitle(String title) {
        boolean diaryIsUnlocked = isUnlocked;
        if(diaryIsUnlocked){
            for (Gists newGists: newGistsList) {
                if (newGists.getTitle().equals(title)){
                    newGistsList.remove(newGists);
                    break;
                }
                else System.out.println("GIST DOESN'T EXIST.");
            }
        }
    }
//    @Override
//    public String toString(){
//        return title +" - "+ body;
//    }
    public String findMy_gist_ByTitle(String title){
        boolean diaryIsUnlocked = isUnlocked;
        if(diaryIsUnlocked){
          for (Gists newgist: newGistsList) {
              if(newgist.getTitle().equalsIgnoreCase(title)){
                  String titleBody = newgist.getBody();
                  return titleBody;
              }
          }
        }
            return "GIST DOESN'T EXIST";
    }

    public void updateEntry(int id, String title, String body) {
        boolean diaryIsUnlocked = isUnlocked;
        if(diaryIsUnlocked){
            for (Gists newGist: newGistsList) {
                if(newGist.getId() == id){
                    newGist.setTitle(title);
                    newGist.setBody(body);
                }
            }
        }
    }
    public String getUserName() {
        return username;
    }

}
