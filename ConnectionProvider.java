package project;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider
{
public static void main(String args[]) throws Exception
{
  getCon();
}
 public static Connection getCon() throws Exception{

  try{
   
   String url = "jdbc:mysql://24.196.52.166:3306/testdb";
   String username = "username";
   String password = "password";
  
   
   Connection conn = DriverManager.getConnection(url,username,password);
   System.out.println("Connected");
   return conn;
  } 
  catch(Exception e){System.out.println(e);}
  
  
  return null;
 }
}