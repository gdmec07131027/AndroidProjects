package cn.edu.gdmec.s07131027.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.text.style.LineHeightSpan.WithDensity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTextView;
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()){
		case R.id.item1:
			myTextView.setText("我大神你懂吗？");
			break;
		case R.id.item2:
			myTextView.setText("我大师你知道吗？");
			break;
		case R.id.item3:
			myTextView.setText("我是大师/大神！！！");
		}
		return super.onMenuItemSelected(featureId, item);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
