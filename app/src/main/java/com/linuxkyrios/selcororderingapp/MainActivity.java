package com.linuxkyrios.selcororderingapp;

import androidx.appcompat.widget.Toolbar; //Necessary class to use toolbar in app
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Downloading reference to toolbar, and setting it as activity bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    //This method will add all options from menu container to app bar
    public boolean onCreateOptionsMenu(Menu menu) {
        //Using container menu file and Menu object, which is reference to menu container file/
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    //This method is for on click reactions on action bar
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
}