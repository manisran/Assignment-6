/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author c0688638
 */
@ApplicationScoped
public class TodoList {
    private List<String> todoList = new ArrayList<>();
    
    public void add(String a){
        todoList.add(a);
    }
    public List<String> getTodoList(){
        return todoList;
    }
    
}
