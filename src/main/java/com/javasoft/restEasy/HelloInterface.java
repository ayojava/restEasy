/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasoft.restEasy;

import com.javasoft.restEasy.vao.Message;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ayojava
 */
@Path("rest")
public interface HelloInterface {

    //http://localhost:8080/restEasy/first/rest/helloWorld
    @GET
    @Path("/helloWorld")
    public String sayHelloWorld();

    //http://localhost:8080/restEasy/first/rest/hello/Ayojava
    @GET
    @Path("/hello/{name}")
    public String sayHelloName(@PathParam("name") String name);

    @GET
    @Path("/allMessages")
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getAllMessages();

    @GET
    @Path("/message/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("messageId") long id);
}

/*

 @Path("customers")
 public interface CustomerService {
 @GET
 @Produces("application/json")
 public List<Customer> listAllCustomers();

 @POST
 @Consumes("application/json")
 @Produces("text/plain")
 public long createCustomer(Customer customer);

 @PUT
 @Path("/{id}")
 @Consumes("application/json")
 @Produces("application/json")
 public Customer updateCustomer(@PathParam("id") long id, Customer customer);

 @DELETE
 @Path("/{id}")
 public void deleteCustomer(@PathParam("id") long id);

 @GET
 @Path("/{id}")
 @Produces("application/json")
 public Customer retrieveCustomerById(@PathParam("id") long id);
 }

 */
