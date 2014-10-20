package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanvim
 */
public class DBHandler {
    
public Connection connection;
public Statement stmt;
public ResultSet rs;
public String url="jdbc:derby://localhost:1527/tanvi";
public String driver="org.apache.derby.jdbc.ClientDriver";

public DBHandler(){
}

public void makeconnection()throws Exception{
Class.forName(driver);
connection=DriverManager.getConnection(url,"tanvi","tanvi");

}
public void releaseConnection()throws Exception{
connection.close();

}
public ResultSet executeQuery(String query)throws Exception{

rs=null;
stmt=connection.createStatement();
rs=stmt.executeQuery(query);
return rs;
}
public void executeUpdate(String query)throws Exception{
int rowaffected=0;
stmt=connection.createStatement();
rowaffected=stmt.executeUpdate(query);

}
}
