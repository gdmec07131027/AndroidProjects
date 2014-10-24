package cn.edu.gdmec.s07131027.intentfilterdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Intent myit= getIntent();
		String host = myit.getData().getHost();
		String path = myit.getData().getPath();
		String newuri = "http://"+host+"/"+path;
		Uri myuri = Uri.parse(newuri);
		Intent myit1 = new Intent(Intent.ACTION_VIEW,myuri);
		startActivity(myit1);
	}
	
}
