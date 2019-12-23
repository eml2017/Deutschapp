/**
 * Created by Elizabeth on 4/20/2017.
 * Updated by Elizabeth on 12/22/2019.
 */

package com.example.deutschappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
    }

    public void buttonAction(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Food")) {
            Toast toast = Toast.makeText(DirectoryActivity.this, "TODO: Create a food activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, FoodDirectoryActivity.class);
            //startActivity(intent);
        } else if (button_text.equals("Entertainment")) {
            Toast toast = Toast.makeText(DirectoryActivity.this, "TODO: Create an entertainment activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, EntertainmentDirectoryActivity.class);
            //startActivity(intent);
        } else if (button_text.equals("Other")) {
            Toast toast = Toast.makeText(DirectoryActivity.this, "TODO: Create an other activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, OtherDirectoryActivity.class);
            //startActivity(intent);
        }
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(DirectoryActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}