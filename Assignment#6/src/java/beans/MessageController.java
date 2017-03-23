package beans;


import beans.Message;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.ws.rs.Path;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c0687421
 */
@ApplicationScoped
public class MessageController {

    List<Message> messages = new ArrayList<>();
    public MessageController(){
       
    }

    public JsonArray getAllJson() {
       JsonArrayBuilder json = Json.createArrayBuilder();
       // for (Message m : json){
          json.id("id");
           json.add("title");
           json.add("content");
           json.add("author");

                   return json;       
        }

    public int getById(int id) {
            return id;
    }
    
    public int getByIdJson(int id) {
                    return id;

        }
    
    }}

