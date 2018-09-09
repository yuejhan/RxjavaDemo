package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 15:20
 */
public interface CallerOnCall<T> {

    void call(CallerEmitter<T> callerEmitter);
}
