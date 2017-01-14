package com.example.wcc.httprequstdemo;

/**
 * Created by wcc on 17/1/13.
 */

public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
