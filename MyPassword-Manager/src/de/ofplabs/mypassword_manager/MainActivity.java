
package de.ofplabs.mypassword_manager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/*
 * Code for the Main Activity with the listview of all the accounts, possibility to add an account (=> switch to AddAccount Activity).
 * You get here after first and second start.
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
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
