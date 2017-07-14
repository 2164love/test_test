package com.igrs.utils.utils;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by xyt on 2017/4/25.
 */

public class ActivityManager {
    private static ArrayList<Activity> activityList = new ArrayList<>();

   public static void addActivity(Activity activity){
       activityList.add(activity);
   }

   public static void removeActivity(Activity activity){
       activityList.remove(activity);
   }
   public static void finishAllActivit(){
       for(Activity activity : activityList){
           if(!activity.isFinishing()){
               activity.finish();
           }
       }
   }
}
