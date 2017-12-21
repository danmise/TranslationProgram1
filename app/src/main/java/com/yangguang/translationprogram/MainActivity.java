package com.yangguang.translationprogram;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    private List<String> list = new ArrayList<String>();
    private TextView myTextView;
    private Spinner mySpinner1;
    private Spinner mySpinner2;
    private ArrayAdapter<String> adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //第一步：添加一个下拉列表项的list，这里添加的项就是下拉列表的菜单项
        list.add("汉语");
        list.add("蒙语");
        list.add("维语");
        list.add("藏语");
        myTextView = (TextView)findViewById(R.id.TextView_sign);
        mySpinner1 = (Spinner)findViewById(R.id.Spinner_language1);
        mySpinner2 = (Spinner)findViewById(R.id.Spinner_language2);
        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //第四步：将适配器添加到下拉列表上
        mySpinner1.setAdapter(adapter);
        mySpinner2.setAdapter(adapter);


        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中
//        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
//            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//                // TODO Auto-generated method stub
//                    /* 将所选mySpinner 的值带入myTextView 中*/
//                myTextView.setText("您选择的是："+ adapter.getItem(arg2));
//                    /* 将mySpinner 显示*/
//                arg0.setVisibility(View.VISIBLE);
//            }
//            public void onNothingSelected(AdapterView<?> arg0) {
//                // TODO Auto-generated method stub
//                myTextView.setText("NONE");
//                arg0.setVisibility(View.VISIBLE);
//            }
//        });
            /*下拉菜单弹出的内容选项触屏事件处理*/
        mySpinner1.setOnTouchListener(new Spinner.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                /**
                 *
                 */
                return false;
            }
        });
        mySpinner2.setOnTouchListener(new Spinner.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                /**
                 *
                 */
                return false;
            }
        });
            /*下拉菜单弹出的内容选项焦点改变事件处理*/
        mySpinner1.setOnFocusChangeListener(new Spinner.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });
        mySpinner2.setOnFocusChangeListener(new Spinner.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });
    }
    protected void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }
}