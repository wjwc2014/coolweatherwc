package com.example.wcc.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by wcc on 17/1/11.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
