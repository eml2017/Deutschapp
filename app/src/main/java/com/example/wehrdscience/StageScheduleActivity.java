package com.example.wehrdscience;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StageScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_schedule);

        /*7:30PM TO 8:30PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        8:45PM TO 10:45PM—BIERGARTEN STAGE Staff Infection
        ----------------------------------------------------------------------------------------
        11AM TO 12PM—OUTDOOR STAGE Nick Garcia (Indie, Folk)
        12PM TO 1PM—OUTDOOR STAGE Thad Striffler (Folk, Pop)
        12:15PM TO 1:15PM—BIERGARTEN STAGE HJ Lally
        1PM TO 2PM—OUTDOOR STAGE Cecil’s Magic brought to you by RJ Exploration & Drilling Company & GO! Odessa Recreation
        1:30PM TO 2:30PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        2PM TO 3PM—OUTDOOR STAGE Nicolas Nelson
        2:45PM TO 4:15PM—BIERGARTEN STAGE Jim Elvidge
        3PM TO 4PM—OUTDOOR STAGE Chris Leffler
        4PM TO 4:30PM—OUTDOOR STAGE Best Kuchen Contest
        4:30PM TO 5PM—OUTDOOR STAGE Best Pickle Contest
        4:30PM TO 6PM—BIERGARTEN STAGE Rusty Jackson Band
        5PM TO 6PM—OUTDOOR STAGE General Disarray
        6:15PM TO 7:45PM—BIERGARTEN STAGE The Funk
        8PM TO 9PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        9:15PM TO 10:45PM—BIERGARTEN STAGE Stoney River
        11PM TO 1AM—BIERGARTEN STAGE Whac-a-Mole
        -----------------------------------------------------------
        11AM TO 12PM—OUTDOOR STAGE Spring Chicks (Clog Dancing)
        12PM TO 12:30PM—OUTDOOR STAGE Ugly Beard Contest
        12:15PM TO 1:15PM—BIERGARTEN STAGE Hillyard Belles
        12:30PM TO 1PM—OUTDOOR STAGE Cutest Dog Contest
        1PM TO 2PM—OUTDOOR STAGE Nick Garcia
        1:30PM TO 2:30PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        2PM TO 3PM—OUTDOOR STAGE Cindy Smith
        2:45PM TO 4:15PM—BIERGARTEN STAGE Perfect Mess
        3PM TO 4PM—OUTDOOR STAGE Oom Pa’s and Ma’s
        4PM TO 5PM—OUTDOOR STAGE 4th Annual Tim Hauge Talent Show
        4:30PM TO 6PM—BIERGARTEN STAGE Rusty Jackson Band
        5PM TO 6PM—OUTDOOR STAGE Evan Gonzales
        6PM TO 7PM—OUTDOOR STAGE General Disarray
        6:15PM TO 7:45PM—BIERGARTEN STAGE The Funk
        6:30PM—Rocky Coulee Brewing LIVE MUSIC by Free Beer Nuts
        8PM TO 9PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        9:15PM TO 10:45PM—BIERGARTEN STAGE Staff Infection
        11PM TO 1AM—BIERGARTEN STAGE Rhythmic Collective
        -------------------------------------------------
        12PM TO 1PM—OUTDOOR STAGE The Campbells (Bluegrass)
        12:15PM TO 1:15PM—BIERGARTEN STAGE Cassandra Wheeler
        1PM TO 2PM—OUTDOOR STAGE Pastor Jon
        1:30PM TO 2:30PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        2:45PM TO 4:15PM—BIERGARTEN STAGE Santos and Scinto
        4:30PM TO 5:30PM—BIERGARTEN STAGE Oom Pa’s and Ma’s
        5:45PM TO 7:15PM—BIERGARTEN STAGE Kosta la Vista
        7:30PM TO 10PM—BIERGARTEN STAGE Odessa Open Jam*/
    }

    public void buttonAction(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Biergarten")) {
            Toast toast = Toast.makeText(StageScheduleActivity.this, "TODO: Create a biergarten activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, BiergartenStageDirectoryActivity.class);
            //startActivity(intent);
        } else if (button_text.equals("Outdoor Stage")) {
            Toast toast = Toast.makeText(StageScheduleActivity.this, "TODO: Create an outdoor stage activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, OutdoorStageDirectoryActivity.class);
            //startActivity(intent);
        } else if (button_text.equals("Rocky Coulee Brewing")) {
            Toast toast = Toast.makeText(StageScheduleActivity.this, "TODO: Create a rocky coulee activity", Toast.LENGTH_LONG);
            toast.show();
            //Intent intent = new Intent(DirectoryActivity.this, RockyCouleeBrewingStageDirectoryActivity.class);
            //startActivity(intent);
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