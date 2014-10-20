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
public class Music {
 private DBHandler db;
private ResultSet rs = null;

public void addMusic(){
try{
db=new DBHandler();
db.makeconnection();
String query = "insert into APP.music values('"+getName()+"','"+getArtist()+"','"+getType()+"','"+getPrice()+"','"+getImageId()+"')";
db.executeUpdate(query);
db.releaseConnection();

}catch(Exception ex){}
}
public ResultSet Search(String entered_search)
{
    try{
db=new DBHandler();
db.makeconnection();
String query = "select * from app.music where name='"+entered_search+"'or artist='"+entered_search+"'or type='"+entered_search+"'";
rs = db.executeQuery(query);
//System.out.println(""+rs.getString("name"));
//db.releaseConnection();
    }catch(Exception e){}
 return rs;   
}



String m_name,m_artist,m_type,m_price,m_image_id;
public void setName(String name){m_name = name;}
public void setArtist(String artist){m_artist = artist;}
public void setType(String type){m_type = type;}
public void setPrice(String price){m_price = price;}
public void setImage_id(String image_id){m_image_id = image_id;}

public String getName(){return m_name;}
public String getArtist(){return m_artist;}
public String getType(){return m_type;}
public String getPrice(){return m_price;}
public String getImageId(){return m_image_id;}

}
