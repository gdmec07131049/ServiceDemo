package cn.edu.gdmec.myservice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button mybt1,mybt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybt1=(Button) findViewById(R.id.button1);
        mybt2=(Button) findViewById(R.id.button2);
        mybt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent myit=new Intent("cn.edu.gdmec.myservice");
				startService(myit);			
			}	
        });
        mybt2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent myit=new Intent("cn.edu.gdmec.myservice");
				stopService(myit);
				
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
