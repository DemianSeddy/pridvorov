package basaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

public class baseSql {

		private Connection con;
		private ResultSet rs;
		private Statement stmt;
		
		
	    //Регистарция БД  
		public baseSql(String reg,String url,String base,String user,String pass) throws ClassNotFoundException, SQLException {
			Class.forName(reg);//регистрируем драйвер
			String urlbase = url+"/"+base;
			this.con = DriverManager.getConnection(urlbase,user,pass);
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
		
	    //Хеш с полями(ключи) и если есть значениями,таблица,условия,орерация над таблицей
		/*ResultSet sql(Hashtable data,String table,String where,String operation) throws SQLException {
			
			 For data
			 //Через запятую
			 {String sqlfieds="";
			 String sqlvalue="";}
			 
			 If !(where.equals(new String(0))) {where="where "+where;} 
			 
			 switch (operation){
		         case "select":
		        	 String sql=operation+data.keys().toString()+" from "+table+" "+where;
		         case "insert":
		        	 String sql=operation+data.keys().toString()+" from "+table+" "+where;
		         case "update":
		        	 String sql=operation+data.keys().toString()+" from "+table+" "+where;
		         case "delete":
		        	 String sql=operation+" from "+table+" "+where;
			 }

			rs = stmt.executeQuery(sql);
			return rs;
		}*/

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
