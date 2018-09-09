package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 12:39
 */
public interface Callee<T> {

    void onError(Throwable throwable);
    void onComplete();
    void onReceive(T t);

}
