//select query Application 
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc3 
{
	public static void main(String[] args) 
	{
		// resorces used in JDBC API
		Connection connection=null;
		Statement statement=null;       
		ResultSet resultSet=null;       
		
	    // DB specific Required parameter	
		String url="jdbc:mysql:///abc";
		String username="root";
		String password="root";
		
		// step 2 : establish the connection with the database
				try 
				{
					connection=DriverManager.getConnection(url,username,password);
					
					if(connection!=null)    //hold some object value(connection obj)
					{
						System.out.println("Connection is established with::" +url);	
						
						// step 3 : create a statement object to transfer the query
						statement= connection.createStatement();
						
						if(statement!=null)
						{
							// step 4 : transfer the query and inform the db engine to execute
							String sqlSelectQuery="select sid,name,age from student";
							resultSet=statement.executeQuery(sqlSelectQuery);
							if(resultSet!=null)
							{
								System.out.println("SID\tNAME\tAGE");     //just header
								while(resultSet.next())
								{
									System.out.println(resultSet.getInt(1)+ "\t" +resultSet.getString(2)+"\t"+ resultSet.getInt(3));
								}
							}
						}
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				//step 5: closing the resource
				finally
				{
					if(resultSet!=null)
					{
						try {
							resultSet.close();   
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(statement!=null)
					{
						try {
							statement.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(connection!=null)
					{
						try {
							connection.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
	}
}
