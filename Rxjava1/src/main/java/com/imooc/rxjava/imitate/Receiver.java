package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 12:39
 */
public abstract class Receiver<T> implements Calling,Callee<T>{
    private volatile boolean unCalled;


    @Override
    public void unCall() {
        unCalled = true;
    }

    @Override
    public boolean isUnCalled() {
        return unCalled;
    }
}
