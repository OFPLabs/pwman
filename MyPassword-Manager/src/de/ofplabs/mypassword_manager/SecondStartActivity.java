
package de.ofplabs.mypassword_manager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/*
 *Code for the SecondStartActivity, which is always launched at the beginning when you start the App.
 *Here you sign in by filling in your master-password and get to MainActivity. 
 */

public class SecondStartActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_start);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_start, menu);
		return true;
	}

}
