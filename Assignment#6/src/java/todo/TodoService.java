/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.io.StringReader;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author c0688638
 */
@Path("todo")
@ApplicationScoped
public class TodoService {

    @Inject
    private TodoList todoList;

    @GET
    @Produces("application/json")
    public JsonArray getAll() {
        JsonArrayBuilder json = Json.createArrayBuilder();
        for (String todo: todoList.getTodoList()) {
            json.add(todo);
        }
        return json.build();
    }
    @GET
    @Produces("application/json")
    public JsonArray getId() {
        JsonArrayBuilder json = Json.createArrayBuilder();
        for (String todo: todoList.getTodoList()) {
            json.add(todo);
        }
        return json.build();
    }
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public JsonArray add(String str){
        JsonObject json = Json.createReader(new StringReader(str)).readObject();
        todoList.add(json.getString("item"));
        return getAll();
    }
}
