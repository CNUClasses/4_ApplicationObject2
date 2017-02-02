package com.example.keith.a4_applicationobject;

import android.app.Application;
import android.util.Log;

/**
 * Created by Perkins on 1/26/2015.
 */
public class applicationObject extends Application{

    private static final String TAG = "Application";
    private static final  int UNINITIALIZED = -1;

    private  Integer myInteger;

    public  Integer getMyInteger() {
        if (myInteger == null)
            myInteger = new Integer(UNINITIALIZED);

        Log.d(TAG,"APPLICATION getMyInteger, myInteger="+ Integer.toString(myInteger));

        return myInteger;
    }

    public  void setMyInteger(Integer myInt) {
        if (myInteger == null)
            myInteger = new Integer(myInt);
        else
            myInteger = myInt;

        Log.d(TAG,"APPLICATION setMyInteger, myInteger="+ Integer.toString(myInteger));

        //the above is the same as
        //myInteger = (myInteger == null) ?new Integer(myInt): myInt;
    }

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
         Log.e(TAG,"APPLICATION onCreate, myInteger=");
    }

    /**
     * This method is for use in emulated process environments.  It will
     * never be called on a production Android device, where processes are
     * removed by simply killing them; no user code (including this callback)
     * is executed when doing so.
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e(TAG,"APPLICATION onTerminate");

    }
}
