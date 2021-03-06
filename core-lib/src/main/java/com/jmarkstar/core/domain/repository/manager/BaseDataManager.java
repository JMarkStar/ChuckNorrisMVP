package com.jmarkstar.core.domain.repository.manager;

import com.jmarkstar.core.domain.interactor.Action;
import com.jmarkstar.core.domain.interactor.executor.MainThread;
import javax.inject.Inject;

/**
 * Created by jmarkstar on 2/06/2017.
 */

abstract class BaseDataManager {

    @Inject MainThread mMainThread;

    void notifySuccess(final Object response, final Action.Callback callback) {
        mMainThread.post(new Runnable() {
            @Override public void run() {
                callback.onSuccess(response);
            }
        });
    }

    void notifyError(final Throwable throwable, final Action.Callback callback) {
        mMainThread.post(new Runnable() {
            @Override public void run() {
                callback.onError(throwable);
            }
        });
    }
}
