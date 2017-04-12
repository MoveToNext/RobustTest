package com.liu.robusttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.RobustCallBack;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.show_text);
        button = (Button) findViewById(R.id.button);

        new PatchExecutor(getApplicationContext(), new PatchesInfoImpl(), new RobustCallBack() {
            @Override
            public void onPatchListFetched(boolean result, boolean isNet) {

            }

            @Override
            public void onPatchFetched(boolean result, boolean isNet, Patch patch) {

            }

            @Override
            public void onPatchApplied(boolean result, Patch patch) {

            }

            @Override
            public void logNotify(String log, String where) {

            }

            @Override
            public void exceptionNotify(Throwable throwable, String where) {

            }
        }).start();

        initView();
    }
    private void initView() {
        textView.setText("Robust");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivty.class));
            }
        });
    }
}
