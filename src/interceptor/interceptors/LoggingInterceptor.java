package interceptor.interceptors;

import interceptor.framework.Context;

/**
 * Created by dell on 2020/3/28.
 */
public class LoggingInterceptor implements Interceptor {
    @Override
    public void execute(Context ctx) {
        System.out.println("## Log: " + ctx.getVlaue() +" ##");
    }
}
