/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import java.util.Random;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author alexlondon07
 */
@Path("Api")
public class ApiResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiResource
     */
    public ApiResource() {
    }

    /**
     * Retrieves representation of an instance of test.ApiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ApiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
    
    @Path("/MyMethod")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAproducts(){
       return "My Method services...ok";
    }
    
    @GET
    @Path("/randomNumer")
    @Produces(MediaType.APPLICATION_JSON)    
    public Response generateRndNumber(){
        Random rnd = new Random();        
        return Response.ok(
                response("Numero Aleatorio", String.valueOf(rnd.nextDouble())), 
                MediaType.APPLICATION_JSON).build();
    }
    
    /**
     * metodo privado para dar formato al JSON de respuesta
     * @param operation Operacion que se realiza en el APIREST
     * @param paramater parametro de entrada
     * @param result resultado de la operacion realizada
     * @return String Respuesta en formato JSON
     */
    private String response(String operation, String result) {
        JSONObject obj = new JSONObject();
        try {
            obj.put("operation", operation);
            obj.put("result", result);            
            return obj.toString();
            
        } catch (Exception ex) {
            System.err.println("JSONException: " + ex.getMessage());
        }
        return "";
    }
}
