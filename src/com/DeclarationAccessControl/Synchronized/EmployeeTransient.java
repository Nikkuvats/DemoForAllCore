package com.DeclarationAccessControl.Synchronized;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeTransient implements Serializable {

	private String firstname;
	private String lastname;
	private transient String password;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
   {
	try 
	{
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empInfo.ser"));
	EmployeeTransient emp = new EmployeeTransient();
	emp.setFirstname("Lokesh");
	emp.setLastname("Gupta");
	emp.setPassword("hihihi");
		   //Serialize the object
	oos.writeObject(emp);
	oos.close();
	} catch (Exception e)
	{
	System.out.println(e);
	}
  }
}
	
