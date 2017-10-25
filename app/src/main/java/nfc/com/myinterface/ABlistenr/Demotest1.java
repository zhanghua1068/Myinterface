package nfc.com.myinterface.ABlistenr;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by zhanghua on 2017/10/25.
 */

public class Demotest1 implements Alistener,Binterface {
    @Override
    public void get() {
        Log.e(TAG, "get: 接口b的方法" );
    }

    @Override
    public void print() {
        Log.e(TAG, "print 接口a的方法" );
    }
}
