package com.aya.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

class Test {
    static String a="";
}

public class MainActivity extends AppCompatActivity {

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
                textView.setText(Test.a);

            }
        });
    }
}
