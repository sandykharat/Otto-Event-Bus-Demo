package eventbus.demo.sandeep.edu.myapplication;

import com.squareup.otto.Bus;

/**
 * Created by sandeep_kharat on 3/30/2017.
 */

public class GlobalOttoBus {
    private static Bus sBus;
    private GlobalOttoBus(){
        sBus=new Bus();
    }
    public static Bus getsBus(){
        if(null==sBus){
            synchronized (GlobalOttoBus.class){
                if(null==sBus){
                    new GlobalOttoBus();
                }
            }
        }
        return sBus;
    }
}
