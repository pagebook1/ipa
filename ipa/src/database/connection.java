package database;
import game.login;
import teacher.student_voice_record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;

public class connection {
	
	static String uniqueID = UUID.randomUUID().toString();
	 public static Connection getConnection() throws Exception{
	  try{
	   String driver = "com.mysql.cj.jdbc.Driver";
	   String url = "jdbc:mysql://ipadatabase.mysql.database.azure.com:3306/ipa"; // localhost or ipadatabase.mysql.database.azure.com
	   String username = "pagebook"; //pagebook or root
	   String password = "031920Kevin"; //031920Kevin or ""
	   Class.forName(driver);
	   
	   Connection conn = DriverManager.getConnection(url,username,password);
//	   System.out.println("Connected");
	   return conn;
	  } catch(Exception e){
		  System.out.println(e);
	}
	  
	  
	  return null;
	 }
	 public static void create_User(String fname,String lname,String user, String pass) throws Exception {
		 Connection con = getConnection();
		 Statement stmt=con.createStatement();  
		 stmt.executeUpdate("INSERT INTO `user_accounts` (`id`, `first_name`, `last_name`, `user`, `password`, `account_type`)"
		 		+ " VALUES (NULL, '"+fname+"', '"+lname+"', '"+user+"', '"+pass+"', 'student')");
	 }
	 public static ArrayList<String> id() throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `user_accounts`");
		 while(rs.next())
		 {
			 info.add(rs.getString("id"));
		 }
		return info;
		 
	 }
	 public static ArrayList<String> getInfos(String id) throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `user_accounts` where id = "+id+"");
		 while(rs.next())
		 {
			 info.add(rs.getString("first_name"));
			 info.add(rs.getString("last_name"));
			 info.add(rs.getString("user"));
			 info.add(rs.getString("password"));
		 }
		return info;
		 
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
			 info.add(rs.getString("first_name"));
			 info.add(rs.getString("last_name"));
		 }
		return info;
	 }
	 public static  ArrayList<String> userInfo(String id) throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM `user_accounts` WHERE id = "+id+"");
		 while(rs.next())
		 {
			 info.add(rs.getString("first_name"));
			 info.add(rs.getString("last_name"));
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
	 public static void updateRecord(String id,String fname,String lname,String user,String pass) throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 stmt.executeUpdate("UPDATE `user_accounts` SET `first_name` = '"+fname+"', `last_name` = '"+lname+"', `user` = '"+user+"', `password` = '"+pass+"' WHERE `user_accounts`.`id` = "+id+"");
		 
	 }
	 public static void deleteRecord(String id) throws Exception {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 stmt.executeUpdate("DELETE FROM `user_accounts` WHERE `user_accounts`.`id` = "+id+"");
		 
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
	 public static void submitActivity2(String uniqueid,int x,String accuracy, String pron,String filename) throws Exception{
		 String id = game.login.infos.get(0);
		 Connection con = getConnection();
		 Statement stmt=con.createStatement();  
		 try {
			stmt.executeUpdate("INSERT INTO `act2_scores` (`attempt_id`, `word_id`,`student_id`,`accuracy`,`pronoun`,`filename`) VALUES ('"+uniqueid+"','"+x+"', '"+id+"','"+accuracy+"','"+pron+"','"+filename+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.print(filename);
	 }
	 public static ArrayList<String> getAct2Records(String id) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT attempt_id FROM `act2_scores` WHERE student_id = '"+id+"' && word_id=1");
		 while(rs.next())
		 {
			 info.add(rs.getString("attempt_id"));
		 }
		return info;
	 }
	 public static ArrayList<ArrayList> getAct2Scores(String recordid) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList<ArrayList> finals = new ArrayList<ArrayList>();
		 ArrayList <String> info = new ArrayList<String>();
		 ArrayList <String> info2 = new ArrayList<String>();
		 ArrayList <String> info3 = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM act2_scores WHERE `attempt_id`='"+recordid+"'");
		 while(rs.next())
		 {
			 info.add(rs.getString("accuracy"));
			 info2.add(rs.getString("pronoun"));
			 info3.add(rs.getString("filename"));
		 }
		 finals.add(info);
		 finals.add(info2);
		 finals.add(info3);
		 System.out.print(finals.get(0));
		return finals;
		 
	 }
	 public static void submitActivity4(ArrayList<String> answers,String filename,String attempt_id) throws Exception{
		 String id = game.login.infos.get(0);
		 Connection con = getConnection();
		 Statement stmt=con.createStatement();  
		 try {
			stmt.executeUpdate("INSERT INTO `act4_table` (`attempt_id`, `student_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`,`q7`, `filename`) VALUES ('"
		 +attempt_id+"','"+id+"', '"+answers.get(0)+"','"+answers.get(1)+"','"+answers.get(2)+"','"+answers.get(3)+"','"+answers.get(4)+"','"+answers.get(5)+"','"+answers.get(6)+"','"+filename+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.print(filename);
	 }
	 public static ArrayList<String> getAct4Records(String id) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT attempt_id FROM `act4_table` WHERE student_id = '"+id+"'");
		 while(rs.next())
		 {
			 info.add(rs.getString("attempt_id"));
		 }
		return info;
	 }
	 public static ArrayList<String> getAct4Scores(String recordid) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM act4_table WHERE `attempt_id`='"+recordid+"'");
		 while(rs.next())
		 {
			 info.add(rs.getString("q1"));
			 info.add(rs.getString("q2"));
			 info.add(rs.getString("q3"));
			 info.add(rs.getString("q4"));
			 info.add(rs.getString("q5"));
			 info.add(rs.getString("q6"));
			 info.add(rs.getString("q7"));
			 info.add(rs.getString("filename"));
		 }
		return info;
		 
	 }
	 public static void submitActivity3(String word, String answer,String score,String attempt_id) throws Exception{
		 String id = game.login.infos.get(0);
		 Connection con = getConnection();
		 Statement stmt=con.createStatement();  
		 try {
			stmt.executeUpdate("INSERT INTO `act3_table` (`attempt_id`, `student_id`, `word`, `answer`, `pron_score`) VALUES ('"+attempt_id+"', '"+id+"', '"+word+"', '"+answer+"', '"+score+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.print(attempt_id);
	 }
	 public static ArrayList<String> getAct3Records(String id) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT DISTINCT(attempt_id) FROM `act3_table` WHERE student_id = '"+id+"'");
		 while(rs.next())
		 {
			 info.add(rs.getString("attempt_id"));
		 }
		return info;
	 }
	 public static ArrayList<String[]> getAct3Recording(String recordid) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String[]> info = new ArrayList<String[]>();
		 ArrayList <String> answer = new ArrayList<String>();
		 ArrayList <String> word = new ArrayList<String>();
		 ArrayList <String> score = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM act3_table WHERE `attempt_id`='"+recordid+"'");
		 while(rs.next())
		 {
			 answer.add(rs.getString("answer"));
			 score.add(rs.getString("pron_score"));
			 word.add(rs.getString("word"));
		 }
		 info.add((String[]) word.toArray(new String[0]));
		 info.add((String[]) answer.toArray(new String[0]));
		 info.add((String[]) score.toArray(new String[0]));
		return info;
		 
	 }
	 public static void submitActivity1(String uniqueid,ArrayList<String> answers,String textbox,String string) throws Exception
	 {
			 String id = game.login.infos.get(0);
			 Connection con = getConnection();
			 Statement stmt=con.createStatement();  
			 try {
				stmt.executeUpdate("INSERT INTO `act1_table` (`attempt_id`, `student_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `textbox`, `filename`) VALUES"
						+ " ('"+uniqueid+"', '"+id+"', '"+answers.get(0)+"', '"+answers.get(1)+"', '"+answers.get(2)+"', '"+answers.get(3)+"', '"+answers.get(4)+"', '"+textbox+"', '+filename+')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.print(string);
	 }
	 public static ArrayList<String> getAct1AttemptID(String id) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT attempt_id FROM `act1_table` WHERE student_id = '"+id+"'");
		 while(rs.next())
		 {
			 info.add(rs.getString("attempt_id"));
		 }
		return info;
	 }
	 public static ArrayList<String> getAct1Records(String recordid) throws Exception
	 {
		 Connection con = getConnection();
		 ArrayList <String> info = new ArrayList<String>();
		 Statement stmt=con.createStatement();  
		 ResultSet rs = stmt.executeQuery("SELECT * FROM act1_table WHERE `attempt_id`='"+recordid+"'");
		 while(rs.next())
		 {
				 info.add(rs.getString("q1"));
				 info.add(rs.getString("q2"));
				 info.add(rs.getString("q3"));
				 info.add(rs.getString("q4"));
				 info.add(rs.getString("q5"));
				 info.add(rs.getString("textbox"));

		 }
		return info;
		 
	 }
	 
}
