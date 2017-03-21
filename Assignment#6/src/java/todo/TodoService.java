/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
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
}
