package com.imooc.rxjava.imitate;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 16:31
 */
public class main {

    public static void main(String[] args) {
        Caller.create(new CallerOnCall<String>() {
            @Override
            public void call(CallerEmitter<String> callerEmitter) {
                callerEmitter.onReceive("test");
                callerEmitter.onCompleted();
            }
        }).call(new Callee<String>() {
            @Override
            public void onCall(Release release) {
                System.out.println("onCall");
            }

            @Override
            public void onReceive(String s) {
                System.out.println("onReceive:"+s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });
    }
}
