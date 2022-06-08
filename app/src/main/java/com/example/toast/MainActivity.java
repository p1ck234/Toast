package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Обезьяна закрыла глаза!",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }

    public void ButtonClicked1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Обезьяна закрыла уши!",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }

    public void ButtonClicked2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Обезьяна закрыла рот",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }
}