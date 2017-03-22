
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c0687421
 */
@Path("/message")
@RequestScoped
public class MessageRest {

    public static DateFormat sdf = new SimpleDateFormat("yyyy-dd-mm hh:mm:ss:ss2");

    List<Message> messgeList = new ArrayList<>();
    @GET
    @Produces("application/json")
     public Response getAll() {
        JsonArrayBuilder json = Json.createArrayBuilder();
        
             for (Message m : Message) {
            json.add(m.toJSON());
        }
        return Response.ok(json.build().toString()).build();
    }
    
}
