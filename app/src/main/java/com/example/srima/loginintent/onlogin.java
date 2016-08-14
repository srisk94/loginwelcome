package com.example.srima.loginintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by srima on 15-07-2016.
 */
public class onlogin extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.onloginn);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview=new TextView(this);
        textview.setTextSize(40);
        textview.setText(message);
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.content);
        layout.addView(textview);
    }
}
