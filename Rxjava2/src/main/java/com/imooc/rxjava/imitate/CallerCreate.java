package com.imooc.rxjava.imitate;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 15:26
 */
public class CallerCreate<T> extends Caller<T> {
    private CallerOnCall<T> mCallerOnCall;

    public CallerCreate(CallerOnCall<T> mCallerOnCall){
        this.mCallerOnCall = mCallerOnCall;
    }

    @Override
    protected void callActual(Callee<T> callee) {
        CreateEmitter<T> tCreateEmitter = new CreateEmitter<>(callee);
        callee.onCall(tCreateEmitter);
        mCallerOnCall.call(tCreateEmitter);
    }


    public static final class CreateEmitter<T> extends AtomicReference<Release> implements CallerEmitter<T>,Release{

        private Callee<T> callee;
        public CreateEmitter(Callee<T> callee){
            this.callee = callee;
        }
        @Override
        public boolean isReleased() {
            return ReleaseHelper.isReleased(get());
        }

        @Override
        public void release() {
            ReleaseHelper.release(this);
        }

        @Override
        public void onReceive(T t) {
            if(!isReleased()){
                callee.onReceive(t);
            }
        }

        @Override
        public void onError(Throwable e) {
            if(!isReleased()){
                callee.onError(e);
            }
        }

        @Override
        public void onCompleted() {
            if(!isReleased()){
                callee.onCompleted();
            }
        }
    }
}
