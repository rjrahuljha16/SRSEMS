package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	private String jdbcURL;
	private String jdbcUsername;
	private String idbcPassword;
	private Connection jdbcConnection;
	
	public EmployeeDao(String jdbcURL, String jdbcUsername, String idbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.idbcPassword = idbcPassword;
	}
	
	protected void connect() throws SQLException{
		if(jdbcConnection==null || jdbcConnection.isClosed()){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e)
			{
				throw new SQLException(e);
			}
			jdbcConnection= DriverManager.getConnection(jdbcURL, jdbcUsername, idbcPassword);
		}	
	}
	
	protected void dissconnect() throws SQLException{
		if(jdbcConnection != null&& !jdbcConnection.isClosed()){
			jdbcConnection.close();
		}
	}
	
	public List<Employee> adminLogin() throws SQLException{
		List<Employee> listAdmin =new ArrayList<>();
		
		String sql="SELECT admin_id FROM admin WHERE admin_id=? and admin_password=?";
		connect();
		
		PreparedStatement pst= jdbcConnection.prepareStatement(sql);
		ResultSet resultset=pst.executeQuery();
		
		while(resultset.next())
		{
			String admin_id= resultset.getString("admin_id");
			Employee employee= new Employee(admin_id);
			listAdmin.add(employee);
		}
		
		resultset.close();
		pst.close();
		dissconnect();
		return listAdmin;
	}
	
}
