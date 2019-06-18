package NewJdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
public class jdbc {
public static void main(String[] args) throws Throwable {

	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/vtigerdatabase", "root", "admin");
	Statement sat=con.createStatement();
	ResultSet result=sat.executeQuery("select * from newstudent");
	System.out.println("done");
	while(result.next())
	{
		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
	}
}
}
