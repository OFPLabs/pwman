
package de.ofplabs.mypassword_manager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

/*
 * Code for AddAccount activity which is launched from the MainActivity when the user wants to add a new account entry.
 * Here you fill in stuff like name, password, comment etc. for the new account.
 * By pressing the back-button you get back to MainActivity.
 * 
 * Later the possibility to change and add different account entries should be implemented.
 */

public class AddAccountActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_account);
		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// at the moment, we dont need anything in the actionbar here
		
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.add_account, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch ( item.getItemId() )
		{
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				// As the user hasnt saved the new Account, we have to notify him by a toast
				Toast toast = Toast.makeText(getApplicationContext(), "Cancelled adding new Account", Toast.LENGTH_SHORT);
				toast.show();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	

}
