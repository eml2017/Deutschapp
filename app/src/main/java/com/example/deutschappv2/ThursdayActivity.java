/**
 * Created by Elizabeth on 11/21/2016.
 * Updated by Elizabeth on 12/22/2019.
 */

package com.example.deutschappv2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThursdayActivity extends AppCompatActivity {
    List<Event> thursdayEventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        thursdayEventList = new ArrayList<Event>();
        thursdayEventList.add(new Event("Chalk Drawing", "Wheatland Bank", "5:00 PM (sign-up starts at 4:45 PM)"));
        thursdayEventList.add(new Event("Tricycle Race", "First Avenue", "6:00 PM"));
        thursdayEventList.add(new Event("Bed Races", "First Avenue", "After the tricycle race"));
        thursdayEventList.add(new Event("Biergarten Opens", "Biergarten", "7:00-11:00 PM"));

        ListView thursdayListView = (ListView) findViewById(R.id.thursdayListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                thursdayEventList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = thursdayEventList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        thursdayListView.setAdapter(arrayAdapter);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(ThursdayActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }

    public void openMaps(View view) {
        Toast toast = Toast.makeText(ThursdayActivity.this, "TODO: Work on specific map activities", Toast.LENGTH_LONG);
        toast.show();
        /*String button_text;
        button_text = ((TextView) view).getText().toString();
        if (button_text.equals("Chalk Drawing (Wheatland Bank) ..... 5pm")) {
            Intent intent = new Intent(this, ChalkMap.class);
            startActivity(intent);
        } else if (button_text.equals("Tricycle Race (First Avenue) ..... 6pm")) {
            Intent intent = new Intent(this, ParadeMap.class);
            startActivity(intent);
        } else if (button_text.equals("Bed Race (First Avenue) ..... after the tricycle race")) {
            Intent intent = new Intent(this, ParadeMap.class);
            startActivity(intent);
        } else if (button_text.equals("German Biergarten ..... 7pm-11pm")) {
            Intent intent = new Intent(this, BierGarten.class);
            startActivity(intent);
        }*/
    }
}