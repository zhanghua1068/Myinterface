package nfc.com.myinterface.ComputerUser;

/**
 * Created by zhanghua on 2017/10/25.
 */

public class Computer {
    public void plugin(USB usb) {
        usb.install() ;
        usb.work() ;
    }
}
