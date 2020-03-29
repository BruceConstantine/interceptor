package interceptor.framework.Service;

import interceptor.framework.Context;

/**
 * Created by dell on 2020/3/28.
 */
public class ServiceImp implements Service{ // service == message
    public void execute(Context ctxObj_msg) {
            System.out.println("@@@@ Internal Service Invoked! And, Message obejct is :"+ctxObj_msg.getVlaue()+"@@@@");
    }
}
