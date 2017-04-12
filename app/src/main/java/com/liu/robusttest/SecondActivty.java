package com.liu.robusttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.meituan.robust.patch.annotaion.Modify;

/**
 * <pre>
 * PackageName:  com.liu.robusttest
 * Description:
 * Created by :   Liu
 * date:         2017/4/12 14:48
 * </pre>
 */
public class SecondActivty extends AppCompatActivity {

    private ListView listView;
    private TextView text;
    private String[] multiArr = {"列表1", "列表2", "列表3", "列表4"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tww);
        listView = (ListView) findViewById(R.id.listview);
        text = (TextView) findViewById(R.id.text);
        initData();
    }

    @Modify
    private void initData() {
        BaseAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, multiArr);
        listView.setAdapter(adapter);
//        text.setText("修复前的数据");
        text.setText("修复后的数据");
    }
}
