package cn.edu.gdmec.s07131027.buttondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
	TextView myTextView;
	EditText myEditText;
	Button myBtn;
	ImageButton myImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView1);
        myBtn = (Button) findViewById(R.id.button1);
        myImageBtn = (ImageButton) findViewById(R.id.imageButton1);
        myEditText = (EditText) findViewById(R.id.editText1);
        myTextView.setText("我是不是最帅的 ");
        myEditText.setText("请叫我雷州清爷");
        myBtn.setOnClickListener(buttonlistener);
    }
    
    Button.OnClickListener buttonlistener = new Button.OnClickListener() {	
		@Override
		public void onClick(View v) {
			myTextView.setText("我绝对是最帅的");			
		}
	};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
