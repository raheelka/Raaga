/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.ResultSet;

/**
 *
 * @author tanvim
 */
public class Bank {
    private DBHandler db;
    private ResultSet rs = null;
    String b_name,b_passkey,bal;
    public ResultSet Select(String cuser,String pass) throws Exception
    {
        db = new DBHandler();
        db.makeconnection();
        String query = "select * from APP.bank where username='"+cuser+"' and passkey='"+pass+"'";
        rs = db.executeQuery(query);
        return rs;
    }
    
    public void Update(String bal,String cuser) throws Exception
    {
        db = new DBHandler();
        db.makeconnection();
        String query = "update APP.bank set bal='"+ bal+"' where username='"+cuser+"'";
        db.executeUpdate(query);
    }
    
    public void setUsername(String uname){ b_name = uname;}
    public String getUsername(){ return b_name;}   
    public void setPasskey(String passkey){ b_passkey = passkey;}
    public String getPasskey(){ return b_passkey;} 
    public void setBal(String balance){ bal = balance;}
    public String getBal(){ return bal;}   
}
