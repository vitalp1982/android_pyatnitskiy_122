package com.vital.android_pyatnitskiy_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView link = findViewById(R.id.link_text);
        final int rnd = rnd(0, 1000);
        link.setText("http:\\images\\" + rnd);

    }

    public void nextImage(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class); //создание Intent
        startActivity(intent); //запуск нового экрана
    }

    public void prevImage(View view) {
        finish();
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
