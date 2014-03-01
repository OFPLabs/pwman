package de.ofplabs.mypassword_manager;

import android.os.Bundle;

/*	
 * The Account-class used for the Accounts the user can set up to store his passwords. 
 * It currently just has 3 attributes with getters and setters and two overloaded constructors.
 * 
 * The ListView in Activity-Main and the Activity-Account-View is filled with the data from this class' instances.
 * Activity-Add-Account generates an instance of this class to store and show the Data. 
 * This should be closely connected to the processes of saving and loading (eventually managed with classes).
 */

public class Account
{
	private String name;
	private String password;
	private String note;
	private String email;
	
	public Account(String name, String password) { this(name,password,null); }
	public Account(String name, String password, String note)
	{
		this.name = name;
		this.password = password;
		this.note = note;
	}


        
	public void setEmail(String email) { this.email = email; }
	public String getEmail() { return email; }
		
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
		
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
	
	public void setNote(String note) { this.note = note; }
	public String getNote() { return note; }

}


