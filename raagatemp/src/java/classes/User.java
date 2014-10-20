package classes;



import java.sql.ResultSet;


//import java.sql.SQLException;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanvim
 */
public class User {
 private DBHandler db;
private ResultSet rs = null;

public void addlogin(){
try{
db=new DBHandler();
db.makeconnection();
String query = "insert into APP.user_details values('"+getLoginName()+"','"+getPwd()+"','"+getCCN()+"','"+getUserName()+"','"+getAddress()+"','"+getE_mail()+"','"+getMobile_no()+"')";
db.executeUpdate(query);
db.releaseConnection();

}catch(Exception ex){
}}
public ResultSet checkUnamePass(String user,String passwo)throws Exception{
   
db=new DBHandler();
db.makeconnection();
String query1 = "select * from APP.USER_DETAILS where username='"+user+"'and pass='"+passwo+"'";
rs = db.executeQuery(query1);
/*if(rs.next())
{
    db.releaseConnection();
return "yes";
}
else
{db.releaseConnection();
    return "no";}
*/
return rs;
}
    //catch(Exception ex){
//}

           
    String lname;
    String pwd;
    String credit_card_no;
    String uname;
    String address;
    String mob_no;
    String e_mail;
    
    public void setLoginName(String name)
    {
    lname=name;
    }
    public String getLoginName()
    {
        return lname;
    }
    
    public void setPwd(String pass) 
    {
    pwd=pass;
    }
    public String getPwd()
    {
        return pwd;
    }
    
    public void setCCN(String ccn)
    {
    credit_card_no =ccn;
    }
    public String getCCN()
    {
        return credit_card_no;
    }
    
    public void setUserName(String name) 
    {
    uname = name;
    }
    public String getUserName()
    {
        return uname;
    }
    
    public void setAddress(String addr1) 
    {
    address = addr1;
    }
    public String getAddress()
    {
        return address;
    }
    
    public void setE_mail(String email) 
    {
    e_mail = email;
    }
    public String getE_mail()
    {
        return e_mail;
    }
    
    public void setMobile_no(String mob) 
    {
    mob_no = mob;
    }
    public String getMobile_no()
    {
        return mob_no;
    }
}
