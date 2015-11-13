package com.example.nnguy637.voyage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class mainScreenActivity extends AppCompatActivity {

    //request coded
    private static final int REQUEST_CODE_ADD_PROJECT = 0;
    private static final int REQUEST_CODE_SETTINGS = 2;
    //our user options
    private ImageView mAddProjectButton;
    private ImageView mRemoveProjectButton;
    private ImageView mSettingsButton;

    //what displays if there are no current projects
    private TextView mEmptyProjectTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_screen);

        mEmptyProjectTextView = (TextView)findViewById(R.id.empty_projects_text);
        mEmptyProjectTextView.setText(R.string.empty_projectArray);

        mAddProjectButton = (ImageView)findViewById(R.id.add_Project_Button);

        //I'll set this up to link to your project creation intent when you create it. - Nam
        mAddProjectButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = addProjectActivity.newIntent(mainScreenActivity.this);
                startActivityForResult(i, REQUEST_CODE_ADD_PROJECT);
            }
        });

        mRemoveProjectButton = (ImageView)findViewById(R.id.remove_Project_Button);

        mSettingsButton = (ImageView)findViewById(R.id.settings_Button);
        mSettingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = settingsActivity.newIntent(mainScreenActivity.this);
                startActivityForResult(i, REQUEST_CODE_SETTINGS);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
