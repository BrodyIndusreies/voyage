package com.example.nnguy637.voyage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by nnguy637 on 10/27/2015.
  *
 */
public class addProjectActivity extends AppCompatActivity{

    public static Intent newIntent(Context packageContext)
    {
        Intent i = new Intent(packageContext, addProjectActivity.class);
        return i;
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_add_project);
    }
}
