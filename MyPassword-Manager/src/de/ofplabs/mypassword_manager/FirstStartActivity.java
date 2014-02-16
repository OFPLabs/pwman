
package de.ofplabs.mypassword_manager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/*
 * Code for FirstStartActivity only launched when the App is first time started after installation.
 * Here you can sign up and create your master password, getting to MainActivity afterwards.
 */

public class FirstStartActivity extends Activity
{
	
	Button OKbutton;
	EditText edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_start);
		edit = (EditText)findViewById(R.id.editText);
		OKbutton = (Button)findViewById(R.id.button1);
		OKbutton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				setContentView(R.layout.activity_main);
				
			}
		});
	}
	

}
