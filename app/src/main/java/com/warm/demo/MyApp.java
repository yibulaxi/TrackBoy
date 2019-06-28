package com.warm.demo;

import android.app.Application;
import android.content.Intent;
import android.view.View;

import com.warm.demo.detail.DetailActivity;
import com.warm.demo.data.Data;
import com.warm.track.Track;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Track.init(new DefaultTracker(this),new DefaultD());

        Data.putEvent("c2a56b89e1ddcd454cc29dd729ac065d", "00001", "按钮");

        Data.putEvent("d2e6b1364c7fd935d1bb5e5788343247", "00002", "选中#未选中");

        Data.putEvent("c6fb01aa89e4a01cb4d40304f0c9e27a","00003","打开弹框");

        Data.putEvent("e5cfec6bddcbc26958c45e124c371226","00003","申请信息：");


        Data.putEvent("6b4ea1b0816ceb9ecfc646dcd724dc09","cbd_433","看我");
        Data.putEvent("ddfbc6841607928a9adb84a969724335","cbd_433","看我");


    }


    public void goDetail(View v) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
