package com.igrs.utils.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by xyt on 2017/4/25.
 */

public class Utils {

    private static long startTime;
    private static Toast toast;
    //退出应用
    public static void  exitApp(Context context){
        long currentTime = System.currentTimeMillis();
        long timeStamp = currentTime-startTime;
        if(timeStamp>0&&timeStamp<1500){
            ActivityManager.finishAllActivit();
        }else{
            Toast.makeText(context, "再次点击退出", Toast.LENGTH_SHORT).show();
            startTime = currentTime;
        }
    }

}
