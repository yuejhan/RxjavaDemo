package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 12:38
 */
public class Caller<T> {

    final OnCall<T> onCall;

    public Caller(OnCall<T> onCall){
        this.onCall = onCall;
    }

    public static <T> Caller<T> create(OnCall<T> onCall){
        return new Caller<>(onCall);
    }

    public Calling call(Receiver<T> receive){
        this.onCall.call(receive);
        return receive;
    }

    public interface OnCall<T> extends Action1<Receiver<T>>{

    }

}
