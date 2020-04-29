import java.sql.*;
import java.util.*;
class Details123
{
	public static void main(String args[])throws Exception
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///student","megha","mysql123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select* from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getInt(2));
		}
		rs.close();
		st.close();
		con.close();
		}
}