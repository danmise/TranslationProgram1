package com.yangguang.translationprogram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by yangguang on 2017/12/21.
 */

public class DisplayMessageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        接着要调用方法 setContentView(R.layout.activity_display_message);，setContentView 就
//        是 说 活 动 创 建 以 后 ， 这 就 是 我 需 要 渲 染 到 屏 幕 上 的 视 图 ---- 这 个 视图就是
//        R.layout.activity_display_message，也就是就是在第一步我们编写 XML 布局文件描述 UI 的
//        activity_display_message 文 件 ， 放 置 在 layout 目 录 下 。
//        setContentView(R.layout.activity_display_message)是在告诉机器，activity_display_message 中
//        定义有布局 layout，这就是我要输出到屏幕的。这就是 Java 中用 XML 定义 UI，及程序上引
//        用和操纵它们的方式。

        setContentView(R.layout.activity_display_message);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=(TextView)findViewById(R.id.ShowMessage);
        textView.setText(message);//设置文本为 message
    }
}
