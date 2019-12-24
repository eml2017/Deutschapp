package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StageScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_schedule);
    }

    public void buttonAction(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Biergarten")) {
            Intent intent = new Intent(StageScheduleActivity.this, BiergartenActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Outdoor Stage")) {
            Intent intent = new Intent(StageScheduleActivity.this, OutdoorStageActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Rocky Coulee Brewing")) {
            Intent intent = new Intent(StageScheduleActivity.this, RockyCouleeBrewingActivity.class);
            startActivity(intent);
        }
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(StageScheduleActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}