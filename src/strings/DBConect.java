package strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConect {
	public static String MySqlDriver;
	public static String MySqlURL;
	public static Connection con;
	public static Statement stat;
	public static ResultSet rs;
	 
	public static Statement getConnToMySql()
    {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dreamtimenews?useUnicode=true&characterEncoding=GBK";
			con = DriverManager.getConnection(url,"root","");
			stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return stat;
    } 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			stat = getConnToMySql();
			rs = stat.executeQuery("SELECT * FROM admin");
			while(rs.next()) {
				System.out.println(rs.getString("adminname"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
