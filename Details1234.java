import java.sql.*;
class Details1234
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myd","root","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student12");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getInt(2));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}