/**
 * Created by Thomas on 11/21/16.
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

public class SaturdayActivity extends AppCompatActivity {
    List<Event> saturdayEventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);

        saturdayEventList = new ArrayList<Event>();
        saturdayEventList.add(new Event("Lions Club Farmer's Breakfast", "Community Center", "7:00-10:00 AM"));
        saturdayEventList.add(new Event("Breakfast Buffet", "Chiefs Bar & Grill", "7:00-11:00 AM"));
        saturdayEventList.add(new Event("Buffet Breakfast", "Odessa Golf & RV", "8:00-10:00 AM"));
        saturdayEventList.add(new Event("Odessa High School ASB Fun Run", "City Park", "8:30 AM (registration & check-in 7:00-8:00 AM)"));
        saturdayEventList.add(new Event("Friends of the Library Used Book Sale", "18 W 1st Ave", "9:00 AM-5:00 PM"));
        saturdayEventList.add(new Event("Odessa High School FBLA Vendor Street Fair", "Division Street", "10:00 AM-7:00 PM"));
        saturdayEventList.add(new Event("Kiddie and General Parade", "First Avenue", "10:30 AM"));
        saturdayEventList.add(new Event("German Food Court", "Fest Platz on Main Street (First Avenue)", "11:00 AM-8:00 PM"));
        saturdayEventList.add(new Event("Biergarten Opens", "Biergarten", "11:00-1:00 AM (after parade)"));
        saturdayEventList.add(new Event("Rocky Coulee Brewing Opens", "Rocky Coulee Brewing Co.", "11:00 AM (after parade)"));
        saturdayEventList.add(new Event("Kid Zone", "City Park", "12:00-6:00 PM"));
        saturdayEventList.add(new Event("Historisches Museum Open", "West 4th Ave. & Elm St.", "12:00-6:00 PM"));
        saturdayEventList.add(new Event("Ag Machinery Display", "Historisches Museum", "12:00-6:00 PM"));
        saturdayEventList.add(new Event("Vintage Textile Display", "St. Matthew's Church (Alder St & 4th Ave)", "12:00-5:00 PM"));
        saturdayEventList.add(new Event("Poker Run Tournament 2-Person Scramble", "Odessa Golf & RV", "1:00 PM"));
        saturdayEventList.add(new Event("Old Town Hall Rejuvenation Project Cash Bingo", "Old Town Hall", "1:00-4:00 PM"));
        saturdayEventList.add(new Event("German Minute to Win It", "Rocky Coulee Brewing Co.", "1:00-5:00 PM (kids welcome until 7:00 PM)"));
        saturdayEventList.add(new Event("Guitar Workshop", "Across from Rolling Thunder Pizza", "2:00 PM"));
        saturdayEventList.add(new Event("Rocky Coulee Brewing Happy Hour Specials", "Rocky Coulee Brewing Co.", "3:00-5:00 PM"));
        saturdayEventList.add(new Event("Rocky Coulee Brewing Fest Games", "Rocky Coulee Brewing Co.", "3:00 PM"));
        saturdayEventList.add(new Event("Rocky Coulee Brewing Beer Stein Holding Contest", "Rocky Coulee Brewing Co.", "4:00 PM"));

        ListView saturdayListView = (ListView) findViewById(R.id.saturdayListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                saturdayEventList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = saturdayEventList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        saturdayListView.setAdapter(arrayAdapter);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(SaturdayActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}