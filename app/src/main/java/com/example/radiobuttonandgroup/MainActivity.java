package com.example.radiobuttonandgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton[] rbs = new RadioButton[4];
    Switch sw;
    Button changeBtn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rbs[0] = (RadioButton) findViewById(R.id.rbRED);
        rbs[1] = (RadioButton) findViewById(R.id.rbBLUE);
        rbs[2] = (RadioButton) findViewById(R.id.rbGREEN);
        rbs[3] = (RadioButton) findViewById(R.id.rbYellow);

        sw = (Switch) findViewById(R.id.swtch);
        changeBtn = (Button) findViewById(R.id.changeBtn);
        iv = (ImageView) findViewById(R.id.imageView);

    }


    public void clickedRed(View view) {
        if(sw.isChecked())
        {
            iv.setBackgroundColor(Color.RED);
        }
    }

    public void clickedBlue(View view) {
        if(sw.isChecked())
        {
            iv.setBackgroundColor(Color.BLUE);
        }
    }

    public void clickedGreen(View view) {
        if(sw.isChecked())
        {
            iv.setBackgroundColor(Color.GREEN);
        }
    }

    public void clickedYellow(View view) {
        if(sw.isChecked())
        {
            iv.setBackgroundColor(Color.YELLOW);
        }
    }

    public void clicked(View view) {
        if(!sw.isChecked())
        {
            if(rbs[0].isChecked())
            {
                iv.setBackgroundColor(Color.RED);
            }
            else if(rbs[1].isChecked())
            {
                iv.setBackgroundColor(Color.BLUE);
            }
            else if (rbs[2].isChecked())
            {
                iv.setBackgroundColor(Color.GREEN);
            }
            else
            {
                iv.setBackgroundColor(Color.YELLOW);
            }
        }
    }
}