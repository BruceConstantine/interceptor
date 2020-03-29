package interceptor.framework;

import interceptor.framework.Service.Service;
import interceptor.framework.Service.ServiceImp;
import interceptor.interceptors.Interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2020/3/28.
 */
public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<Interceptor>();

    public void addInterceptor(Interceptor i){
        interceptors.add(i);
    }

    public void execute(Context ctx){ //callback
        for (Interceptor i : interceptors ) {
            i.execute(ctx);
        }
    }

//    Service service; //    不是很确定service是属于Dispatcher 的还是Framework的
//    public void setServiceImp(ServiceImp serviceImp){
//        this.service = serviceImp;
//    }
}
