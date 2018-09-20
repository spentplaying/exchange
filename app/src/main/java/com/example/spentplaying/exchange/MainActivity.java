package com.example.spentplaying.exchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String now = "0";
    private float exchange = 30.88f;
    private String ori = "0";
    private int mode = 0;
    private boolean has_v = false,has_d=false;
    private void show_value(){
        TextView tx1 = (TextView) findViewById(R.id.text1);
        TextView tx2 = (TextView) findViewById(R.id.text2);
        String text2 ;
        if(mode == 0) text2 = Float.toString(Float.parseFloat(now)*exchange);
        else text2 = Float.toString(Float.parseFloat(now)/exchange);
        tx1.setText(now);
        tx2.setText(text2);
    }
    public void reset(){
        now = ori;
        has_v = false;
        has_d = false;
        show_value();
    }
    public void change(){
        mode = 1- mode;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_value();
        Button button_ch = (Button) findViewById(R.id.change);
        button_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                change();
                ImageView img1= (ImageView) findViewById(R.id.img1);
                if(mode==0) img1.setImageResource(R.drawable.usd);
                else img1.setImageResource(R.drawable.twd);
                ImageView img2= (ImageView) findViewById(R.id.img2);
                if(mode==1) img2.setImageResource(R.drawable.usd);
                else img2.setImageResource(R.drawable.twd);
                TextView tx1 = (TextView) findViewById(R.id.tx1);
                if(mode==0) tx1.setText("USD");
                else tx1.setText("TWD");
                TextView tx2 = (TextView) findViewById(R.id.tx2);
                if(mode==1) tx2.setText("USD");
                else tx2.setText("TWD");
            }
        });
        // C
        Button button_C = (Button) findViewById(R.id.button_C);
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        // 1
        Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='1';
                show_value();
            }
        });
        // 2
        Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='2';
                show_value();
            }
        });
        // 3
        Button button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='3';
                show_value();
            }
        });
        // 4
        Button button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='4';
                show_value();
            }
        });
        //5
        Button button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='5';
                show_value();
            }
        });
        // 6
        Button button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='6';
                show_value();
            }
        });
        // 7
        Button button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='7';
                show_value();
            }
        });
        // 8
        Button button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='8';
                show_value();
            }
        });
        // 9
        Button button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_v){
                    now="";
                    has_v=true;
                }
                now+='9';
                show_value();
            }
        });
        // 0
        Button button_0 = (Button) findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(has_v) {
                    now += '0';
                    show_value();
                }
            }
        });
        // .
        Button button_d = (Button) findViewById(R.id.button_d);
        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!has_d) {
                    has_d = true;
                    if (!has_v) has_v = true;
                    now += '.';
                    show_value();
                }
            }
        });
    }
}
