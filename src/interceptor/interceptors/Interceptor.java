package interceptor.interceptors;

import interceptor.framework.Context;

/**
 * Created by dell on 2020/3/28.
 */
public interface Interceptor { //Out-of-band Service 带外服务
    public void execute(Context ctx);
}
