package zzz.com.utilslibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import zzz.com.lqx_utils.ToastUtils;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonToast  = (Button) findViewById(R.id.button_toast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showLongToast("测试lib");
            }
        });
    }
}
