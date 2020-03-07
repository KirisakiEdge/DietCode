package com.example.pnu2dietcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_second)
public class SecondActivity extends AppCompatActivity {

    @ViewById(R.id.editText)
    EditText editText;


    @Click
    void button2(){
        String getEditText = editText.getText().toString();
        MainActivity_.intent(this).implementString(getEditText).start();
    }
}
