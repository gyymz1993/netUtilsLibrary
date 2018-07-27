package com.ryan.corelibs.model.api;

import com.itbour.callback.DataBeanCallBack;
import com.ryan.corelibs.model.entity.MapData;
import com.ryan.corelibs.model.entity.Module;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by guoh on 2018/7/25.
 * 功能描述：
 * 需要的参数：
 */
public interface ModuleApi {

    @GET(Urls.GET_MODULE_LIST)
    Observable<DataBeanCallBack<MapData<Module>>> getModuleList(@Query("setIds") String setIds,
                                                        @Query("durations") String durations,
                                                        @Query("industrySetIds") String industrySetIds,
                                                        @Query("pageNum") int pageNum, @Query("pageSize") int pageSize,
                                                        @Query("withTotalPage") int withTotalPage);

    @GET(Urls.GET_APP_BASIC_INFO)
    Observable<DataBeanCallBack> getAppBasicInfo(@Query("device") String device, @Query("appVer") String appVer);


//       stringObjectHashMap.put("device", 610);
//        stringObjectHashMap.put("userId", 1);
//        stringObjectHashMap.put("opTypes", "[2,4]");
//    //pageNum	是
//        stringObjectHashMap.put("pageNum", 0);
//    //页码 pageSize
//        stringObjectHashMap.put("pageSize", 4);

    @GET(Urls.GETUSERWORKLIST_V1_0)
    Observable<DataBeanCallBack> getUserWorkList(@Query("device") String device, @Query("userId") String userId,
                                         @Query("299188") String opTypes, @Query("pageNum") int pageNum,
                                         @Query("pageSize") int pageSize);

}
