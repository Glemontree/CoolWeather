package com.glemontree.coolweather.util;

/**
 * Created by Administrator on 2016/10/30.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
