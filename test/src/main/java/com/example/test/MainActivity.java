package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    EditText et1;
    RelativeLayout baseLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        et1 = findViewById(R.id.et1);
        baseLayout = findViewById(R.id.baseLayout);

        setTitle("제주도 풍경");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.web);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){


            case R.id.rotation1:
                img1.setRotation(Float.parseFloat(et1.getText().toString()));
                return true;

            case R.id.op1:
                img1.setImageResource(R.drawable.jeju2);
                return true;

            case R.id.op2:
                img1.setImageResource(R.drawable.jeju5);
                return true;

            case R.id.op3:
                img1.setImageResource(R.drawable.jeju12);
                return true;
        }
        return false;
    }
}