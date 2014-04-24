
package de.ofplabs.mypassword_manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/*
 * Code for the Main Activity with the listview of all the accounts, possibility to add an account (=> switch to AddAccount Activity).
 * You get here after first and second start.
 * This is the Parent Activity of all the other Activities.
 */

public class MainActivity extends Activity
{ 

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
	    // Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
	   inflater.inflate(R.menu.actionbar_mainactivity, menu);
	   return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
	    // Handle presses on the action bar items
	    switch (item.getItemId()) 
	    {
	        case R.id.action_new:
	           	Intent newintent = new Intent(this, AddAccountActivity.class);
	           	startActivity(newintent);
	            return true;
	        case R.id.action_settings:
	      	  	Intent settingsintent = new Intent(this, SettingsActivity.class);
	           	startActivity(settingsintent);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	
	
	
}
