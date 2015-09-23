package example;
import java.sql.*;

public class Connection_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
//			Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
//			String url = "jdbc:jtds:sqlserver://localhost:1433/kiddy";
//			DriverManager.registerDriver(new com.microsoft.jdbc.sqlserver.SQLServerDriver());
			String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=kiddy";
			Connection con = DriverManager.getConnection(url,"sa","sa");
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("select * from teacher");
			while (rs.next())
			{
				System.out.print(rs.getInt(1)+"\n");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
/*		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch(InstantiationException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			
		}
		
	}

}
