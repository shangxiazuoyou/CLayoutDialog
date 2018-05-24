package com.shangxiazuoyou.clayoutdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import shangxiazuoyou.library.clayoutdialog.CLayoutDialog;
import shangxiazuoyou.library.clayoutdialog.DialogViewHolder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        CLayoutDialog cLayoutDialog = new CLayoutDialog(this, R.layout.dialog) {
            @Override
            public void convert(DialogViewHolder holder) {

            }
        }.fromBottomToMiddle().setCancelAble(true).showDialog();
    }
}
