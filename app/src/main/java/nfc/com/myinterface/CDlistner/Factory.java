package nfc.com.myinterface.CDlistner;

/**
 * Created by zhanghua on 2017/10/25.
 */

public class Factory {
    public static Fruit getInstance(String className){
        if("apple".equals(className)){
            return new Applle();
        }else if("orange".equals(className)){
            return new Orange();
        }else{
            return null;
        }

    }
}
