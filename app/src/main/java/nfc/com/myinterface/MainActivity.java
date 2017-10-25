package nfc.com.myinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nfc.com.myinterface.ABlistenr.Alistener;
import nfc.com.myinterface.ABlistenr.Demotest1;
import nfc.com.myinterface.ABlistenr.Demotest2;
import nfc.com.myinterface.CDlistner.Factory;
import nfc.com.myinterface.CDlistner.Fruit;
import nfc.com.myinterface.ComputerUser.Computer;
import nfc.com.myinterface.ComputerUser.MP3;
import nfc.com.myinterface.ComputerUser.Phone;

public class MainActivity extends AppCompatActivity {
    private String TAG="aaaa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Demotest1 inerfaceDemo1=new Demotest1();
        Demotest2 demotest2=new Demotest2();
        Alistener a=inerfaceDemo1;
        a.print();
        Log.e("TAG", "onCreate: "+ a.MSG);
        Alistener b=new Demotest2();
        b.print();

        Fruit f= Factory.getInstance("apple");
        f.eat();

        Computer c = new Computer() ;
        c.plugin(new Phone()) ;
        c.plugin(new MP3());

    }
}
