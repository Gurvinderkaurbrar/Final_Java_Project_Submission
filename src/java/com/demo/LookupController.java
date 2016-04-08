/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

/**
 *
 * @author Ruturaj
 */
public class LookupController {
    
    private List<Lookup> list = new ArrayList();
    
    
    

    public LookupController() {
        
         try {
            // TODO: Connect to the database and query the DB for all items in the
            //       Catalog table. Iterate through the results to build the List
            //       of Catalog objects and assign it to the private List instance

            Connection conn = Utils.getConnection();
            String str = "SELECT * FROM info";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()){
                
                Lookup look = new Lookup();
                look.setInfoId(rs.getInt("info_id"));
                look.setBizName(rs.getString("biz_name"));
                look.setAddress(rs.getString("address"));
                look.setFirtName(rs.getString("first_name"));
                look.setLastName(rs.getString("last_name"));
                look.setEmail(rs.getString("email"));
                look.setContactNo(rs.getString("contact_no"));
                look.setImage(rs.getString("image"));
                
                list.add(look);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex);
        }
    }
    
    
    public List<Lookup> getAll() {
        // TODO: Return the entire List of Catalog items
        
        return list;
    }
}
