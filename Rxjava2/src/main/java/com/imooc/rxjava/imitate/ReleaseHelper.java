package com.imooc.rxjava.imitate;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author cody
 * @version V1.0
 * @create 2018/9/3 16:12
 */
public enum  ReleaseHelper implements Release {
    RELEASED;


    public static boolean isReleased(Release release){
        return release == RELEASED;
    }

    public static boolean release(AtomicReference<Release> releaseAtomicReference){
        Release current = releaseAtomicReference.get();

        Release d = RELEASED;

        if(current != d){
            current = releaseAtomicReference.getAndSet(d);
            if(current != d){
                if(current != null){
                    current.release();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isReleased() {
        return true;
    }

    @Override
    public void release() {

    }
}
