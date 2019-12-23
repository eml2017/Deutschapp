/**
 * Created by Cole on 4/20/2017.
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

public class FridayActivity extends AppCompatActivity {
    List<Event> fridayEventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        fridayEventList = new ArrayList<Event>();
        fridayEventList.add(new Event("Odessa FFA Pancake Breakfast", "Community Center", "7:00-10:15 AM"));
        fridayEventList.add(new Event("Breakfast Buffet", "Chiefs Bar & Grill", "7:00-11:00 AM"));
        fridayEventList.add(new Event("Friends of the Library Used Book Sale", "18 W 1st Ave", "9:00 AM-5:00 PM"));
        fridayEventList.add(new Event("Old Fashioned German Bake Sale", "Old Town Hall", "10:00 AM until sold out"));
        fridayEventList.add(new Event("Vintage Textile Display", "St. Matthew's Church (Alder St & 4th Ave)", "10:00 AM-5:00 PM"));
        fridayEventList.add(new Event("Odessa High School FBLA Vendor Street Fair", "Division Street", "10:00 AM-7:00 PM"));
        fridayEventList.add(new Event("German Food Court", "Fest Platz on Main Street (First Avenue)", "11:00 AM-8:00 PM"));
        fridayEventList.add(new Event("Biergarten Opens", "Biergarten", "12:30 PM-1:00 AM"));
        fridayEventList.add(new Event("Rocky Coulee Brewing Opens", "Rocky Coulee Brewing Co.", "2:00 PM"));
        fridayEventList.add(new Event("Historical Museum Open", "West 4th Ave. & Elm St.", "2:00-6:00 PM"));
        fridayEventList.add(new Event("Odessa High School Football Game (The Sausage Bowl)", "Finney Field", "7:00 PM"));

        ListView fridayListView = (ListView) findViewById(R.id.fridayListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                fridayEventList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = fridayEventList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        fridayListView.setAdapter(arrayAdapter);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(FridayActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}