package Diary;

import java.time.LocalDateTime;

public class Gists {
    private String title;
    private String body;
    private int id;
    private LocalDateTime dateCreated;

    public Gists(int id, String title, String body){
        this.title = title;
        this.body = body;
        this.id = id;
    }

}
