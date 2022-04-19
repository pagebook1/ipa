package database;
import game.login;
import teacher.student_voice_record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class connection {
	
	 public static Connection getConnection() throws Exception{
	  try{
	   String driver = "com.mysql.cj.jdbc.Driver";
	   String url = "jdbc:mysql://ipadatabase.mysql.database.azure.com:3306/ipa";
	   String username = "pagebook";
	   String password = "031920Kevin";
	   Class.forName(driver);
	   
	   Connection conn = DriverManager.getConnection(url,username,password);
//	   System.out.println("Connected");
	   return conn;
	  } catch(Exception e){System.out.println(e);}
	  
	  
	  return null;
	 }
	 public static  ArrayList<String> user(String user, String pass) throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `user_accounts` WHERE user='"+user+"' && password ='"+pass+"' ");
		 while(rs.next())
		 {
			 info.add(rs.getString("id"));
			 info.add(rs.getString("user"));
			 info.add(rs.getString("account_type"));
		 }
		return info;
	 }
	 public static String RecordInfo(String filename) throws Exception {
		 String id = game.login.infos.get(0);
		 Connection con = getConnection();
		 Statement stmt=con.createStatement();  
		 stmt.executeUpdate("INSERT INTO `record_list` (`id`, `filename`) VALUES ('"+id+"', '"+filename+"')");
		return filename;
		 
	 }
	 public static ArrayList<String> listRecord() throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `record_list` WHERE id = "+student_voice_record.StudentID);
		 while(rs.next())
		 {
			 info.add(rs.getString("filename"));
		 }
		return info;
		 
	 }
	 public static ArrayList<String> studentID() throws Exception{
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `user_accounts` WHERE account_type = 'student'");
		 while(rs.next())
		 {
			 info.add(rs.getString("id"));
		 }
		return info;
		 
	 }
}
