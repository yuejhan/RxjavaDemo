package com.imooc.rxjava.main;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 12:43
 */
public class Rxjava1 {
    public static void main(String[] args) {

        Subscription subscribe = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onNext("test");
                    subscriber.onCompleted();
                }
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext : " + s);
            }
        });
    }
}
