package beans;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0687421
 */
public class Message {
    
     public  DateFormat timeSet = new SimpleDateFormat("yyyy-dd-mm hh:mm:ss:ss2");
   private int id;
   private String title;
   private String contents;
   private String author;
   
   public Message(){
       
   }

  
    public Message(JsonObject json){
        id =json.getInt("id");
        title=json.getString("title");
        contents=json.getString("contents");
        author=json.getString("author");
        
    }

    

    public  DateFormat getTimeSet() {
        return timeSet;
    }

    public  void setTimeSet(DateFormat timeSet) {
        Message.timeSet = timeSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   
    
    public JsonObject toJSON(){
        return Json.createObjectBuilder()
                .add("id", id)
                .add("title", title)
                .add("contents", contents)
                .add("author", author)
                .build();
    }

}
