package cn.edu.gdmec.s07131027.servicetreaddemo;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button mybt1, mybt2;
	static TextView mytv;
	Intent myit = new Intent("cn.edu.gdmec.s07131027.servicetreaddemo");
	
	static Handler myHandler = new Handler();
	private static double randomDouble;
	
	private static Runnable Refreshlabel = new Runnable() {
		
		@Override
		public void run() {
			mytv.setText(String.valueOf(randomDouble));
		}
	};
	
	public static void UpdateGUI(double refreshDouble){
		randomDouble = refreshDouble;
		myHandler.post(Refreshlabel);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mybt1 = (Button) findViewById(R.id.button1);
		mybt2 = (Button) findViewById(R.id.button2);
		
		mybt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			startService(myit);					
			}
		});
		mybt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
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
