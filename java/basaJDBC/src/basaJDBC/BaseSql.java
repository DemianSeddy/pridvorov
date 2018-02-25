package basaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;



public class BaseSql {
	private Connection con;
	private ResultSet rs;
	private Statement stmt;
	
	

	public BaseSql(String db) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//регистрируем драйвер
		String url = "jdbc:mysql://localhost/"+db;
		this.con = DriverManager.getConnection(url,"root","455001");
		this.stmt = con.createStatement();//создали объект для работы с SQL		
	}
	
	int countStr(String select) throws SQLException {
		int col=0;
		rs = stmt.executeQuery(select);
		while(rs.next()) {
			col++;
		}
		return col;
	}
	
	int countFields(String table) throws SQLException {
		String sql = "select * from "+table+" LIMIT 1";
		rs = stmt.executeQuery(sql);
		return rs.getMetaData().getColumnCount();
	}
	
	//set name='Ivan',age=25 where ...
	
	//int update(String table,Hashtable<String,String> ht,String where) {
		
	
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  new ParserXPath("\\regdriver\text()","basesetting.xml");

	}

}
