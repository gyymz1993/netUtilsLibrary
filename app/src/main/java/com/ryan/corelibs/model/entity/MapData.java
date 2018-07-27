package com.ryan.corelibs.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guoh on 2018/7/25.
 * 功能描述：
 * 需要的参数：
 */
public class MapData<T> implements Serializable{
    public List<T> list;
}
