package com.codeseasy.examples.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button one = (Button) findViewById(R.id.buttonAkun);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.buttonChat);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.buttonArtikel);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.buttonKonsultasi);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.buttonTips);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.buttonInfo);
        six.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAkun:
                startActivity(new Intent(MainActivity.this, Akun.class));
                break;
            case R.id.buttonChat:
                break;
            case R.id.buttonArtikel:
                startActivity(new Intent(MainActivity.this, Artikel.class));
                break;
            case R.id.buttonKonsultasi:
                startActivity(new Intent(MainActivity.this, Konsultasi.class));
                break;
            case R.id.buttonTips:
                startActivity(new Intent(MainActivity.this, Tips.class));
                break;
            case R.id.buttonInfo:
                startActivity(new Intent(MainActivity.this, Info.class));
                break;
        }
    }
}