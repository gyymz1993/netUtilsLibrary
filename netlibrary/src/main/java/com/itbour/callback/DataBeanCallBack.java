package com.itbour.callback;

import com.itbour.subscriber.ResponseHandler;

import java.io.Serializable;

/**
 * Created by guoh on 2018/7/26.
 * 功能描述：
 * 需要的参数：
 */
public class DataBeanCallBack<T> implements Serializable,ResponseHandler.IBaseData {
    public int success;
    public String msg;
    public T data;

    @Override
    public boolean isSuccess() {
        return success==1;
    }

    @Override
    public int status() {
        return success;
    }

    @Override
    public Object data() {
        return data;
    }

    @Override
    public String msg() {
        return msg;
    }
}
