package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List <Diary> newDairies = new ArrayList<>();
    private String title;
    private String body;
    public void add(String title, String body){
        this.title = title;
        this.body = body;
    }
    public Diary findByUsername(String username){
        for (Diary dairy: newDairies) {
            if(dairy.getUserName().equalsIgnoreCase(username)){
                return dairy;
            }
        }
        return null;
    }
    public void delete(String title, String body){
        for (Diary gist: newDairies) {
            gist.deleteGist_ByTitle("My Dare Dairy");
        }
    }
}
