package com.example.deutschappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Map action isn't done yet
    public void showGreetings(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Thursday")) {
            Intent intent = new Intent(this, ThursdayActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Friday")) {
            Intent intent = new Intent(this, FridayActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Saturday")) {
            Intent intent = new Intent(this, SaturdayActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Sunday")) {
            Intent intent = new Intent(this, SundayActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Map")) {
            Toast toast = Toast.makeText(MainActivity.this, "TODO: Create a map activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(this, MapActivity.class);
            //startActivity(intent);
        } else if (button_text.equals("Directory")) {
            Intent intent = new Intent(this, DirectoryActivity.class);
            startActivity(intent);
        }

    }
}