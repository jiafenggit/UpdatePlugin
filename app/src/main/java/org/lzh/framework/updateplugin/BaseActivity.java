package org.lzh.framework.updateplugin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by admin on 16-6-21.
 */
public abstract class BaseActivity extends Activity {

    protected Button startUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
