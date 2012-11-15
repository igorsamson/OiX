package com.io.battleships;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class Temp{
	View tmp;
}

public class Opcje extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opcje);
	    
		View widok = (View) findViewById(R.id.cos);
        final Temp temp1 = new Temp();
        temp1.tmp = widok;
        
		
        Button przyciskB = (Button) findViewById(R.id.button1);
        Button przyciskC = (Button) findViewById(R.id.button2);
        
		
        przyciskB.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v)
        	{
        		//temp1.tmp.setBackgroundColor(getResources().getColor(R.color.white));// 0x0000FF00);
        		Opcje.this.finish();
        	};
 
        });
        
        przyciskC.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v)
        	{
        		//temp1.tmp.setBackgroundColor(getResources().getColor(R.color.black));// 0x0000FF00);
        		Opcje.this.finish();
        	};
 
        });

	}

}
