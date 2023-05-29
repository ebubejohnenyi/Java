package Diary;

import java.util.List;

public class Diaries {
    private List <Diary> newDairies;
    private String title;
    private String body;
    public void add(String title, String body){
        this.title = title;
        this.body = body;
    }
    public Diary findByUsername(String username){
        for (Diary gist: newDairies) {
            if(gist.getTitle().equalsIgnoreCase(username)){
                return gist;
            }
        }
        return null;
    }
    public void delete(String title, String body){
        for (Diary gist: newDairies) {
            gist.deleteEntry();
        }
    }
}
