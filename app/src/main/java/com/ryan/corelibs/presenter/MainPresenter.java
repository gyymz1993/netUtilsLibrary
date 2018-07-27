package com.ryan.corelibs.presenter;

import com.itbour.callback.DataBeanCallBack;
import com.itbour.subscriber.ApiFactory;
import com.itbour.subscriber.ResponseSubscriber;
import com.itbour.subscriber.ResponseTransformer;
import com.lsjr.callback.EncryBeanCallBack;
import com.lsjr.utils.HttpUtils;
import com.ryan.corelibs.ToastMgr;
import com.ryan.corelibs.model.api.ModuleApi;
import com.ryan.corelibs.model.api.Urls;
import com.ryan.corelibs.model.entity.MapData;
import com.ryan.corelibs.model.entity.Module;

import java.util.HashMap;

public class MainPresenter {

    private ModuleApi api = ApiFactory.getFactory().create(ModuleApi.class);

    public void getModuleList(String setIds, String durations, String industrySetIds, int pageNum, int pageSize, int withTotalPage) {
        api.getModuleList(setIds,
                durations, industrySetIds, pageNum, pageSize, withTotalPage)
                .compose(new ResponseTransformer<>())
                .subscribe(new ResponseSubscriber<DataBeanCallBack<MapData<Module>>>() {
                    @Override
                    public void success(DataBeanCallBack<MapData<Module>> data) {
                        ToastMgr.show("list.size() " + data.data.list.size() + data.data.toString());
                    }

                    @Override
                    public void requestError(String exception) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }
                });
    }

    public void getAppBasicInfo() {
        api.getAppBasicInfo("610", "2.3.0").compose(new ResponseTransformer<>())
                .subscribe(new ResponseSubscriber<DataBeanCallBack>() {
                    @Override
                    public void success(DataBeanCallBack baseData) {
                        ToastMgr.show("list.size() " + baseData.data.toString());
                    }

                    @Override
                    public void requestError(String exception) {

                    }
                });
    }


    public void getHomeDetailsData() {
        HashMap<String, Object> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("device", 610);
        HttpUtils.getInstance().executeGet(Urls.GET_APP_BASIC_INFO, stringStringHashMap, new EncryBeanCallBack() {
            @Override
            protected void onXError(String exception) {
            }

            @Override
            protected void onSuccess(String result) {
                // L_.e("APP 基础信息  response===" + result);
                ToastMgr.show("list.size() " + result);
            }
        });
    }

    /**
     * 用户中心作品数据
     */
    public void loadPersonalCenterInfo() {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("device", 610);
        stringObjectHashMap.put("userId", 1);
        stringObjectHashMap.put("opTypes", "[2,4]");
        //pageNum	是
        stringObjectHashMap.put("pageNum", 0);
        //页码 pageSize
        stringObjectHashMap.put("pageSize", 4);
        //getUserWorkListForWeb_v1_0
        HttpUtils.getInstance().executeGet(Urls.GETUSERWORKLIST_V1_0, stringObjectHashMap, new EncryBeanCallBack() {
            @Override
            protected void onXError(String exception) {
                ToastMgr.show("list.size() " + exception);
            }

            @Override
            protected void onSuccess(String response) {
                ToastMgr.show("list.size() " + response);
            }
        });
    }

    /**
     * 用户中心作品数据
     */
    public void loadCenterInfo() {
        api.getUserWorkList("610", "-1", "[2,4]", 0, 4).compose(new ResponseTransformer<>())
                .subscribe(new ResponseSubscriber<DataBeanCallBack>() {
                    @Override
                    public void success(DataBeanCallBack baseData) {
                        ToastMgr.show("list.size() " + baseData.data.toString());
                    }

                    @Override
                    public void requestError(String exception) {
                        ToastMgr.show("list.size() " + exception);
                    }

                });
    }

}
