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
public class Placeorder {
private DBHandler db;
private ResultSet rs = null;
String uname;
String song;


public ResultSet Select(String cuser)
{
    try {
            db=new DBHandler();
db.makeconnection();
String query = "select * from APP.placeorder where username ='"+cuser+"'";
rs = db.executeQuery(query);

//db.releaseConnection();
        }
    catch(Exception e){}
return rs;
}

public void addOrder(){
try{
db=new DBHandler();
db.makeconnection();
String query = "insert into APP.placeorder values('"+getName()+"','"+getSong()+"','1')";
db.executeUpdate(query);
db.releaseConnection();

}catch(Exception ex){}
}
public void Delete(String cuser ) throws Exception
{
    db=new DBHandler();
    db.makeconnection();
    String query = "delete from APP.placeorder where username='"+cuser+"'";
    db.executeUpdate(query);
}
public void update(String quant, String cuser) throws Exception
{
 db=new DBHandler();
    db.makeconnection();
    String query = "update APP.placeorder set quantity='"+quant+"' where username='"+cuser+"'";
    db.executeUpdate(query);   
}
public void setName(String name){uname = name;}
public void setSong(String artist){song = artist;}
public String getName(){return uname;}
public String getSong(){return song;}


}
    

