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

import java.util.ArrayList;
import java.util.List;

public class SundayActivity extends AppCompatActivity {
    List<Event> sundayEventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);

        sundayEventList = new ArrayList<Event>();
        sundayEventList.add(new Event("Breakfast Buffet", "Chiefs Bar & Grill", "7:00-11:00 AM"));
        sundayEventList.add(new Event("Odessa FBLA Pancake Feed & More", "Community Center", "7:30-10:30 AM"));
        sundayEventList.add(new Event("Breakfast served", "Odessa Golf & RV", "8:00-10:00 AM"));
        sundayEventList.add(new Event("Mass", "St. Joseph's Catholic Church", "8:00 AM"));
        sundayEventList.add(new Event("Outdoor Church Service by Odessa Ministerial Association", "Outdoor Stage", "10:30 AM"));
        sundayEventList.add(new Event("Zion Emmanuel Lutheran Church Service", "Zion Emmanuel Lutheran Church", "10:30 AM"));
        sundayEventList.add(new Event("Odessa High School FBLA Vendor Street Fair", "Division Street", "11:00 AM-2:00 PM"));
        sundayEventList.add(new Event("Biergarten Opens", "Biergarten", "11:30 AM-10:00 PM"));
        sundayEventList.add(new Event("Bike Show", "Rolling Thunder Pizza", "12:00-2:00 PM"));
        sundayEventList.add(new Event("Vintage Textile Display & Genealogy Room", "St. Matthew's Church (Alder St & 4th Ave)", "12:00-4:00 PM"));
        sundayEventList.add(new Event("Historical Museum Opens", "West 4th Ave. & Elm St.", "12:00-4:00 PM"));
        sundayEventList.add(new Event("German Food Court", "Fest Platz on Main Street (First Avenue)", "until food runs out"));

        ListView sundayListView = (ListView) findViewById(R.id.sundayListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                sundayEventList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = sundayEventList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        sundayListView.setAdapter(arrayAdapter);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(SundayActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}