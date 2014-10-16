package com.example.contextmenudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView mytv;
	EditText myed;
	final static int a = 1;
	final static int b = 2;
	final static int c = 3;
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		myed.setText("我点击的按钮是："+ item.getTitle()+" ");
		return super.onContextItemSelected(item);
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		menu.setHeaderTitle("快捷键");
		menu.add(0, 1, 0, "第一个快捷键");
		menu.add(0, 2, 0, "第二个快捷键");
		menu.add(0, 3, 0, "第三个快捷键");
		registerForContextMenu(mytv);
		super.onCreateContextMenu(menu, v, menuInfo);
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv = (TextView) findViewById(R.id.textView1);
        myed = (EditText) findViewById(R.id.editText1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
