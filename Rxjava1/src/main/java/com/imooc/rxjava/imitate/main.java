package com.imooc.rxjava.imitate;


/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 13:35
 */
public class main {

    public static void main(String[] args) {
        Caller.create(new Caller.OnCall<String>() {
            @Override
            public void call(Receiver<String> receiver) {
                if(!receiver.isUnCalled()){
                    receiver.onReceive("test");
                    receiver.onComplete();
                }
            }
        }).call(new Receiver<String>() {
            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }

            @Override
            public void onReceive(String s) {
                System.out.println("onReceive:"+s);
            }
        });
    }
}
