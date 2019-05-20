package model;

import java.util.Date;

public class Employee 
{
	private String admin_id;
	private String admin_password;
	private int emp_id;
	private String emp_name;
	private Date emp_doj;
	private Date emp_dob;
	private String emp_desg;
	private String emp_dept;
	
	public Employee(){}     // Default constructor 

	public Employee(String admin_id) {
		this.admin_id = admin_id;
	}

	public Employee(String admin_id, String admin_password)   //Constructor for admin_id and admin password
	{      
		this.admin_id = admin_id;
		this.admin_password = admin_password;
	}

	public Employee(int emp_id) 
	{
		this.emp_id = emp_id;
	}

	public Employee(int emp_id, String emp_name, Date emp_doj, Date emp_dob, String emp_desg, String emp_dept) 
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_doj = emp_doj;
		this.emp_dob = emp_dob;
		this.emp_desg = emp_desg;
		this.emp_dept = emp_dept;
	}

	public Employee(String emp_name, Date emp_doj, Date emp_dob, String emp_desg, String emp_dept) 
	{
		this.emp_name = emp_name;
		this.emp_doj = emp_doj;
		this.emp_dob = emp_dob;
		this.emp_desg = emp_desg;
		this.emp_dept = emp_dept;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Date getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public String getEmp_desg() {
		return emp_desg;
	}

	public void setEmp_desg(String emp_desg) {
		this.emp_desg = emp_desg;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	
}
