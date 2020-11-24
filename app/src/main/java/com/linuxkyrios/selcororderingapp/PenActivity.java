package com.linuxkyrios.selcororderingapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PenActivity extends AppCompatActivity {

    //Adding EXTRA_PENID as constant
    public static final String EXTRA_PENID = "penId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Gathering pen identifier from intent
        int penId = (Integer)getIntent().getExtras().get(EXTRA_PENID);
        Pen pen = Pen.pens[penId];

        //Displaying name of the selected pen
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(pen.getName());

        //Displaying pen description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(pen.getDescription());

        //Displaying selected pen photo
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(pen.getImageResourceId());
        photo.setContentDescription(pen.getName());
    }
}