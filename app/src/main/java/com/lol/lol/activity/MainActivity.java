package com.lol.lol.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lol.lol.R;
import com.lol.lol.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {
    private SlidingMenu mMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = (SlidingMenu) findViewById(R.id.id_menu);
    }
    public void toggleMenu(View view)
    {
        mMenu.toggle();
    }
}
