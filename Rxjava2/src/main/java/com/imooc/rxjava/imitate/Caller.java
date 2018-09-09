package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 14:51
 */
public abstract class Caller<T> {


    public static <T> Caller<T> create(CallerOnCall<T> callerOnCall){
        return new CallerCreate(callerOnCall);
    }

    public void call(Callee<T> callee){
        callActual(callee);
    }

    protected abstract void callActual(Callee<T> callee);

}
