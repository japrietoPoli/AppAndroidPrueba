package com.example.toshiba.myapplication2;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStar(){
        super.onStar();
        Toast.makeText(this, "onStar", Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible (ahora se "reanuda").




    }
}
