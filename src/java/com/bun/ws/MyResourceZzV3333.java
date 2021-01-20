/* bunnnnnnnn
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bun.ws;

import com.bun.model.Customer;
import com.bun.model.Sale;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Visit.R
 */
@Path("myresource")
public class MyResourceZzV3333 {

    @POST
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return output;

    }

    @POST
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
//    @Produces(MediaType.APPLICATION_JSON)
    public String getHello() {
        System.out.println("xxx");

        try {

//            String tranNo = "170020";
//            Session session = SessionUtil.getSession();
//            session.beginTransaction();
//            System.out.println("tranNo : " + tranNo);
//            InvTransaction tran = getTran(session, tranNo);
//            System.out.println("tran id : " + tran.getTransactionId());
//            System.out.println("tran code : " + tran.getTransactionTypeCode());
//            
//            SendTransaction send = new SendTransaction();
//            send.send(tran, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "xxxxxx yz ...invvvvvvv 55556";
    }

    @POST
    @Path("/jsonxx")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> postMessage(List<Customer> cus) throws Exception {
        List<Customer> ret = new ArrayList<Customer>();

        for (Customer customer : cus) {
            System.out.println("cus name : " + customer.getCustomerName());
            for (Sale sale : customer.getSales()) {
                System.out.println("sale : " + sale.getSalePrice());
            }
        }
        
        

        return cus;
    }
}
