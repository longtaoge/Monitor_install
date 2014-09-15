package org.xiangbalao.monitor_install;


import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;


public class MainActivity extends Activity {

    private AppBroadcastReceiver mAppBroadcastReceiver;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        
//      //方式一:在代码中设置IntentFilter 
//      mAppBroadcastReceiver=new AppBroadcastReceiver(); 
//      IntentFilter intentFilter=new IntentFilter(); 
//      intentFilter.addAction("android.intent.action.PACKAGE_ADDED"); 
//      intentFilter.addAction("android.intent.action.PACKAGE_REMOVED"); 
//      intentFilter.addDataScheme("package"); 
//      this.registerReceiver(mAppBroadcastReceiver, intentFilter); 
           
        //方式二:在Manifest.xml中设置IntentFilter 
        //       测试发现方式二效果更好些 
        mAppBroadcastReceiver=new AppBroadcastReceiver(); 
        IntentFilter intentFilter=new IntentFilter(); 
        this.registerReceiver(mAppBroadcastReceiver,intentFilter);
        
        
        
        
    }


}
