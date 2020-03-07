package com.example.pnu2dietcode;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

 final static String MESSAGE = "MyMessage";

    @ViewById(R.id.preview)
    TextView textView;

    @Extra(MESSAGE)
    String implementString = "";

    @Click
    void button(){
        SecondActivity_.intent(this).start();
    }

    @AfterViews
    protected void init() {
        if(implementString != "")
        textView.setText(implementString);
    }

}




