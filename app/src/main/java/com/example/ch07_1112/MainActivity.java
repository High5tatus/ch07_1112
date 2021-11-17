package com.example.ch07_1112;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = findViewById(R.id.baseLayout);
        button1 = findViewById(R.id.button1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0,1,0,"Color(RED)");
        menu.add(0,2,0,"Color(GREEN)");
        menu.add(0,3,0,"Color(BLUE)");

        SubMenu sMenu = menu.addSubMenu("Change Button >>");
        sMenu.add(0,4,0,"Rotating 45");
        sMenu.add(0,5,0,"Size Double");

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case 1:
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case 3:
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 4:
            case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case 5:
            case R.id.subSize:
                button1.setScaleX(2);
                return true;
        }
        return false;
    }

}