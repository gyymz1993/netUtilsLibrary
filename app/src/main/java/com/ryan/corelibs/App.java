package com.ryan.corelibs;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;

import com.itbour.subscriber.ApiFactory;
import com.lsjr.net.AppNetConfig;
import com.lsjr.net.DcodeService;
import com.ryan.corelibs.model.api.Urls;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // GlobalExceptionHandler.getInstance().init(this, getResources().getString(R.string.app_name)); //初始化全局异常捕获
        ToastMgr.init(getApplicationContext()); //初始化Toast管理器
        //Configuration.enableLoggingNetworkParams(); //打开网络请求Log打印，需要在初始化Retrofit接口工厂之前调用



        ApiFactory.getFactory().add(Urls.ROOT); //初始化Retrofit接口工厂
        AppNetConfig.getInstance().setBuider(new AppNetConfig.Builder()
                .setBaseUrl(Urls.ROOT)
                .setShareUrl(Urls.ROOT).setWebUrl(Urls.ROOT));
        DcodeService.initialize(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            // android 7.0系统解决拍照报exposed beyond app through ClipData.Item.getUri()
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            builder.detectFileUriExposure();
        }
    }
}
