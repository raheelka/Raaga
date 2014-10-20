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

}
    

