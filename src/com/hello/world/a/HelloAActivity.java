package com.hello.world.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.drawable.*;

public class HelloAActivity extends Activity 
{
       @Override
    public void onCreate(Bundle savedInstanceState) 
    {
       
        super.onCreate(savedInstanceState);
	      /* TextView vw = new TextView(this); //define
	       vw.setText("Hello World"); // Text*/
	       setContentView(R.layout.main); //view
        
    }
       
}