package com.example.task_sir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.task_sir.MainActivity.mpl;

public class SecondActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        mpl.release();
        finish();
    }
}
