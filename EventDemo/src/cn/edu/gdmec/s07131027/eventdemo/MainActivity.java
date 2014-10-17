package cn.edu.gdmec.s07131027.eventdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTv;
	EditText myEd;
	CheckBox myCb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv = (TextView) findViewById(R.id.textView1);
        myEd = (EditText) findViewById(R.id.editText1);
        myCb = (CheckBox) findViewById(R.id.checkBox1);
        myEd.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				int metaState = event.getMetaState();
				int unicodeChar = event.getUnicodeChar();
				String res="";
		        res +="��������:" + String.valueOf(event.getAction())+"\n";
		        res +="��������:" + String.valueOf(keyCode)+"\n";
		        res +="�����ַ�:" + (char)unicodeChar+"\n";
		        res +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
		        res +="�ظ�����:" + String.valueOf(event.getRepeatCount())+"\n";
		        res +="���ܼ�״̬:" + String.valueOf(metaState)+"\n";
		        res +="Ӳ������:" + String.valueOf(event.getScanCode())+"\n";
		        res +="������־:" + String.valueOf(event.getFlags())+"\n";
		        myTv.setText(res);
				if (myCb.isChecked()){
					return true;
				}else{
					return false;
				}
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
