package com.io.battleships;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class MainMenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        
       Button przyciskO = (Button) findViewById(R.id.button3);
        
		
        przyciskO.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v)
        	{
                Intent intent = new Intent(getApplicationContext(), Opcje.class);
                startActivityForResult(intent,1337); 
        	};
 
        });
        

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
}
