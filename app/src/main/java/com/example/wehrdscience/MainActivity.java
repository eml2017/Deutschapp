package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAction(View view) {
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
            Intent intent = new Intent(MainActivity.this, MapActivity.class);
            intent.putExtra("prevActivity", "map");
            startActivityForResult(intent, 1);
        } else if (button_text.equals("Directory")) {
            Intent intent = new Intent(this, DirectoryActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Executive Log-In")) {
            Intent intent = new Intent(this, ExecutiveLogInActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Stage Schedule")) {
            Intent intent = new Intent(this, StageScheduleActivity.class);
            startActivity(intent);
        }
    }
}