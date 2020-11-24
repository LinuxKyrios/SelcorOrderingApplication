package com.linuxkyrios.selcororderingapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PenCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //This part of code fulfills list view with data from pens array
        ArrayAdapter<Pen> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Pen.pens);
        ListView listPens = (ListView) findViewById(R.id.list_pens);
        listPens.setAdapter(listAdapter);

        //Creating listener object
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listPens,
                                    View itemView,
                                    int position,
                                    long id) {
                // Transmitting clicked pen to PenActivity
                Intent intent = new Intent(PenCategoryActivity.this, PenActivity.class);
                intent.putExtra(PenActivity.EXTRA_PENID, (int) id);
                startActivity(intent);
            }
        };
        // assign listener object to list view
        listPens.setOnItemClickListener(itemClickListener);
    }
}