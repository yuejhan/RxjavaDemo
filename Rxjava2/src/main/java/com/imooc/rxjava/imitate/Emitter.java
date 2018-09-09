package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 14:52
 */
public interface Emitter<T> {

    void onReceive(T t);

    void onError(Throwable e);

    void onCompleted();
}
