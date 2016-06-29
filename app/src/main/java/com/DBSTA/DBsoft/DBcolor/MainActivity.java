package com.DBSTA.DBsoft.DBcolor;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;
import android.text.*;
import junit.runner.*;

public class MainActivity extends Activity{  
    int 胖次蓝=Color.argb(255,0,199,255);
	int 姨妈红=Color.argb(255,255,0,0);
	int 德国灰=Color.argb(255,90,90,90);
	int 咸蛋黄=Color.argb(255,255,220,0);
	int 少女粉=Color.argb(255,255,122,145);
	int 逗笔绿=Color.argb(255,39,249,0);
	String 作者留言="💎这只是一个练习作，请多多包容。📱💻";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toast.makeText(getApplicationContext(),作者留言,
Toast.LENGTH_SHORT).show();
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT)
		{
		Window window = getWindow();//启动沉浸任务栏。。。。
			window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
			WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			//LinearLayout a=(LinearLayout)findViewById(R.id.titledb);

			}
		else if(Build.VERSION.SDK_INT<Build.VERSION_CODES.KITKAT)
		{LinearLayout mGrid= (LinearLayout) findViewById(R.id.titledb);  
		LinearLayout.LayoutParams linearParams = (LinearLayout.LayoutParams) mGrid.getLayoutParams(); // 取控件mGrid当前的布局参数  
			linearParams.height=120;// 当控件的高强制设成110象素  
			mGrid.setLayoutParams(linearParams); // 使设置好的布局参数应用到控件mGrid2 
			}
		}


	public void red(View red1){

		LinearLayout myLayout =  (LinearLayout) findViewById(R.id.titledb);
		myLayout.setBackgroundColor(姨妈红);
		}
	public void pich(View pich1){

		LinearLayout myLayout= (LinearLayout) findViewById(R.id.titledb);
		myLayout.setBackgroundColor(胖次蓝);
		}
	public void de(View de1){
	LinearLayout a=(LinearLayout) findViewById(R.id.titledb);
		a.setBackgroundColor(德国灰);
		}
	public void ji(View ji1){
	LinearLayout a=(LinearLayout) findViewById(R.id.titledb);
		a.setBackgroundColor(咸蛋黄);
		}
	public void fen(View fen1){
	LinearLayout a=(LinearLayout) findViewById(R.id.titledb);
		a.setBackgroundColor(少女粉);
		}
	public void dou(View dou){
	LinearLayout a=(LinearLayout) findViewById(R.id.titledb);
		a.setBackgroundColor(逗笔绿);
		}
	}
