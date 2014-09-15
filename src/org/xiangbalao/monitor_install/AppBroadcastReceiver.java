package org.xiangbalao.monitor_install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AppBroadcastReceiver extends BroadcastReceiver {
	 private final String ADD_APP ="android.intent.action.PACKAGE_ADDED"; 
	    private final String REMOVE_APP ="android.intent.action.PACKAGE_REMOVED";  
	    
	    
	    
	    
//	    ACTION_PACKAGE_ADDED 一个新应用包已经安装在设备上，数据包括包名（最新安装的包程序不能接收到这个广播）
//	    ACTION_PACKAGE_REPLACED 一个新版本的应用安装到设备，替换之前已经存在的版本
//	    ACTION_PACKAGE_CHANGED 一个已存在的应用程序包已经改变，包括包名
//	    ACTION_PACKAGE_REMOVED 一个已存在的应用程序包已经从设备上移除，包括包名（正在被安装的包程序不能接收到这个广播）
//	    ACTION_PACKAGE_RESTARTED 用户重新开始一个包，包的所有进程将被杀死，所有与其联系的运行时间状态应该被移除，包括包名（重新开始包程序不能接收到这个广播）
//	    ACTION_PACKAGE_DATA_CLEARED 用户已经清楚一个包的数据，包括包名（清除包程序不能接收到这个广播）
//	    
	    
	    
	    
	@Override
	public void onReceive(Context context, Intent intent) {
		 String action=intent.getAction(); 
	        if (ADD_APP.equals(action)) { 
	            String packageName=intent.getDataString(); 
	            System.out.println("安装了:"+packageName); 
	            
	            Log.i("app", "安装了:"+packageName);
	            
	        } 
	        if (REMOVE_APP.equals(action)) { 
	            String packageName=intent.getDataString(); 
	            System.out.println("卸载了:"+packageName); 
	            
	            Log.i("app", "卸载了:"+packageName);
	        }  

	}

}
