package libraryapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author shravya
 */
public class DB_Connection {
        static Connection conn = null;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String Title;
		int id;
		int line = 0;
	try
		{
		// Create a connection to the local MySQL server, with the "world" database selected.
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew?user=root&password=shravya92");
		// Create a SQL statement object and execute the query.
		Statement stmt = conn.createStatement();
                    try (ResultSet rs = stmt.executeQuery("SELECT * FROM book order by book_id;")) {
                        while (rs.next())
                        {
                            line++;
                            Title = rs.getString("title");
                            id = rs.getInt("book_id");
                            System.out.println(line + ". " + Title + " " + id);
                        }
                    }
		conn.close();
		System.out.println("Success!!");
		}
	catch(SQLException ex)
		{
		System.out.println("Error in connection: " + ex.getMessage());
		}
	}

}

