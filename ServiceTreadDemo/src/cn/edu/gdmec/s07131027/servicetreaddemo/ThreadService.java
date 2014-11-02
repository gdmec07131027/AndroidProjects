package cn.edu.gdmec.s07131027.servicetreaddemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ThreadService extends Service {
	private Runnable backgroundWork = new Runnable() {
		
		@Override
		public void run() {
			
		try {
			while(!Thread.interrupted()){
				double randomDouble = Math.random();
				MainActivity.UpdateGUI(randomDouble);
				Thread.sleep(1000);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
			
	};
	private Thread workThread;
	

	@Override
	public void onCreate() {
		super.onCreate();
		Toast.makeText(this, "服务创建了", 1000).show();
		workThread = new Thread(null, backgroundWork, "WorkThread");
	}


	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "服务停止了", 1000).show();
		workThread.interrupt();
	}


	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "服务开始了", 1000);
		if(!workThread.isAlive()){
			workThread.start();
		}
		return super.onStartCommand(intent, flags, startId);
	}


	@Override
	public IBinder onBind(Intent arg0) {
		
		return null;
	}

}
