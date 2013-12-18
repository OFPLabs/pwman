
package de.ofplabs.mypassword_manager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/*
 * Code for FirstStartActivity only launched when the App is first time started after installation.
 * Here you can sign up and create your master password, getting to MainActivity afterwards.
 */

public class FirstStartActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_start);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_start, menu);
		return true;
	}

}
