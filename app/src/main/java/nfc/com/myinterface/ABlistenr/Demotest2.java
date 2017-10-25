package nfc.com.myinterface.ABlistenr;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by zhanghua on 2017/10/25.
 */

public class Demotest2 implements Alistener {
    @Override
    public void print() {
        Log.e(TAG, "print: i am from demotest2" );
    }
}
