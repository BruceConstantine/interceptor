package test;

import interceptor.framework.Framework;
import interceptor.framework.Service.ServiceImp;
import interceptor.interceptors.Interceptor;
import interceptor.interceptors.LoggingInterceptor;
/**
 * Created by dell on 2020/3/28.
 */
public class Application {
    public static void main(String[] args) {
        Interceptor logIntceptor = new LoggingInterceptor();
        Framework interceptorFramework = new Framework(new ServiceImp()); // service是concertFramework的内部提供的服务。

        interceptorFramework.addInterceptor(logIntceptor); // register
        interceptorFramework.event(new Message(100) );  // concreteFramework接收外界到来的消息
    }
}
