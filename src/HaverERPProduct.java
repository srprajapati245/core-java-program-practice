import java.sql.*;

public class HaverERPProduct {
	public static void main(String[] args) throws Exception{
		HaverERPProduct hverpp = new HaverERPProduct();
		for(String tableName : args){
			hverpp.find(tableName);
		}	
		
	}
	
	public void find(String tableName) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String query = "SELECT table_name FROM referential_constraints WHERE constraint_schema = 'havererp_prod_10042015' AND referenced_table_name = ?" ;
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/havererp_prod_10042015", "root", "root");
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1,tableName);
		ResultSet rs = statement.executeQuery();
		while(rs.next()){
			if(rs.getString(1).equals(tableName))
				return;
			else{
				System.out.println(tableName + "->" + rs.getString(1));
				find(rs.getString(1));
			}				
		}
		
	}
}