/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tangedco.main;

/**
 *
 * @author Ajith
 */
import java.sql.*;

public class DBHandler {
    
    	Connection con;
	Statement st;

	public DBHandler()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tangedco","root","ajith");


                        System.out.println("Conn Success");
			st=con.createStatement();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
        
}
	
	