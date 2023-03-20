//Insert Application
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc4 
{

	public static void main(String[] args)
	{

		Connection connection=null;
		Statement statement=null;       
		//	ResultSet resultSet=null;       


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
					String sqlSelectQuery="insert into student(sid,name,age) values(45,'Rohit',37)";
					int rowCount=statement.executeUpdate(sqlSelectQuery); 
					if(rowCount>0)
					{
						System.out.println("No of record inserted is :" +rowCount);
					}// end if rowcount
				}// end if statement
			}// end if connection
		} //end of try
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
