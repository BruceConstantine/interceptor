package interceptor.framework;

import interceptor.framework.Service.NullService;
import interceptor.framework.Service.Service;
import interceptor.framework.Service.ServiceImp;
import interceptor.interceptors.Interceptor;
import test.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2020/3/28.
 */
public class Framework {
    private  Dispatcher interceptor_list  ;
    private  Service service;//List<Service> services; //List也行 带内服务列表

    public Framework(Service serviceImp){
        this();
        service = serviceImp;
    }

    public Framework() {
        interceptor_list = new Dispatcher();
        service = new NullService();
    }

    public void setService(Service service){
        this.service = service;
    }

    public void addInterceptor (Interceptor interceptor){
        interceptor_list.addInterceptor(interceptor);
    }

//    public void addService(Service service){
//        services.add(service);
//    }

    public void iterate_list(Context ctx){
        interceptor_list.execute(ctx);
    }

    public void event(Message message) {
        Context ctxObj = new Context();
        ctxObj.setVlaue(message.getValue());

        // callback 执行所有的interceptors
        iterate_list(ctxObj);

        //执行完所有的interceptors后，执行Message Request（执行真正的业务逻辑服务、或者是HTTP请求之类的东西：可以看做这些请求是一个事件，而下面的调用就是响应事件的方法）
        service.execute(ctxObj);
    }
}
