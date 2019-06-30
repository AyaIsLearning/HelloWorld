package com.aya.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.text.SimpleDateFormat;

class Test {
    static String a="";
    static int bb=0;
}

public class MainActivity extends AppCompatActivity {
    private SeekBar sb;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1=findViewById(R.id.imageButton);
        final TextView textView=findViewById(R.id.textView);
        Switch my_switch=findViewById(R.id.my_switch);

        my_switch.setChecked(false);
        if(my_switch.isChecked()) {
            ImageView image=findViewById(R.id.imageView);
            image.setVisibility(View.VISIBLE);
        }
        else{
            ImageView image=findViewById(R.id.imageView);
            image.setVisibility(View.INVISIBLE);
        }

        my_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    //load pic
                    ImageView image=findViewById(R.id.imageView);
                    image.setVisibility(View.VISIBLE);
                }
                else{
                    //don't load pic
                    ImageView image=findViewById(R.id.imageView);
                    image.setVisibility(View.INVISIBLE);
            }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test.a+="1";
                Test.bb+=1;
                textView.setText(Test.a);
                System.out.println(Test.bb);
            }
        });

        CheckBox box= findViewById(R.id.checkBox);
        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    textView.setText("被选中");
                }
                else{
                    textView.setText("取消选中");
                }
            }
        });

        /*sb=(SeekBar)findViewById(R.id.seekBar);
        tv=(TextView) findViewById(R.id.textView2);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                tv.setText("The progress is "+progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });*/


    }
}
