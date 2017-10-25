package nfc.com.myinterface.CDlistner;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by zhanghua on 2017/10/25.
 */

public class Applle implements Fruit {
    @Override
    public void eat() {
        Log.e(TAG, "eat: 吃苹果" );
    }
}
