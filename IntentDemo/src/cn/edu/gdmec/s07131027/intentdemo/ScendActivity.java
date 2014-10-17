package cn.edu.gdmec.s07131027.intentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ScendActivity extends Activity {
	TextView myTv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myTv = (TextView) findViewById(R.id.textView1);
		String text = getIntent().getExtras().getString("text");
		myTv.setText(text);
	}
	
}
