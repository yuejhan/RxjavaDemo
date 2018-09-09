一、响应式编程是一种面向数据流和变化传播的编程范式。
   数据流：只能按照事先规定好的顺序被读取一次的数据的序列。
   变化传播：类似观察者模式，变化了要通知别人。
   编程范式：
   
   
Rxjava1
----------
1.observable

    * 观察得到的----被观察者。
    * 通过Observable创建一个可观察的序列（create）。
    * 通过subscribe注册一个观察者。
2.Observer

    * 用于接受数据----观察者
    * 作为Observable的subscribe方法的参数
3.Subscription

    * 订阅，用于描述被观察者和观察者之间的关系
    * 有两个方法，取消订阅和获取当前订阅的状态
4.OnSubscribe

    * 当订阅时会触发此接口的调用。实现了action1的call
    * 在Observable的内部，实际作用是向订阅者发射数据。
5.Subscriber

    * 实现了Observer和Subscription（只是实现了Subscription）
    * 只有自己才能阻止自己
    
背压概念
-----------
1.异步环境下产生的问题
2.发送和处理速度不统一
3.是一种流速控制解决策略。

Rxjava2 无背压
-------------
1.Observable

    * 观察得到的----被观察者，不支持背压
    * 通过Observable创建一个观察序列（create）
    * 通过subscribe注册一个观察者。
2.observer
    
    * 用于接受数据----观察者
    * 作为Observable的subscribe方法的参数
3.Disposable

    * 和1的subscription作用相当
    * 用于取消订阅和获取订阅的状态
4.ObservableOnSubscribe

    * 和1中的OnSubscribe作用一样
    * 当订阅时会触发此接口
    * 在Observable中的内部，实际作用是向订阅者发射数据
5.Emitter
    
    * 一个发射数据的接口，和Observer的方法类似。
    * 本质是对Observer和Subscriber的包装
    
Rxjava2 有背压
-------------
1.
2.
3.
4.
5.









