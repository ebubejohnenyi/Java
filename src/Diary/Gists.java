package Diary;

import java.time.LocalDateTime;

public class Gists {
    private String title;
    private String body;
    private int id;
    private LocalDateTime dateCreated;

    public Gists(String title, String body){
        this.title = title;
        this.body = body;
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
    public String getBody(){
        return this.body;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
