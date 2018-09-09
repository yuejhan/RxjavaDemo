package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 14:51
 */
public interface Callee <T>{

    void onCall(Release release);

    void onReceive(T t);

    void onError(Throwable e);

    void onCompleted();
}
