package com.example.wehrdscience;

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

public class BiergartenActivity extends AppCompatActivity {
    List<Event> biergartenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biergarten);

        biergartenList = new ArrayList<Event>();
        biergartenList.add(new Event("Oom Pa's and Ma's", "Thursday", "7:30-8:30 PM"));
        biergartenList.add(new Event("Staff Infection", "Thursday", "8:45-10:45 PM"));
        biergartenList.add(new Event("HJ Lally", "Friday", "12:15-1:15 PM"));
        biergartenList.add(new Event("Oom Pa's and Ma's", "Friday", "1:30-2:30 PM"));
        biergartenList.add(new Event("Jim Elvidge", "Friday", "2:45-4:15 PM"));
        biergartenList.add(new Event("Rusty Jackson Band", "Friday", "4:30-6:00 PM"));
        biergartenList.add(new Event("The Funk", "Friday", "6:15-7:45 PM"));
        biergartenList.add(new Event("Oom Pa's and Ma's", "Friday", "8:00-9:00 PM"));
        biergartenList.add(new Event("Stoney River", "Friday", "9:15-10:45 PM"));
        biergartenList.add(new Event("Whac-a-Mole", "Friday", "11:00 PM-1:00 AM"));
        biergartenList.add(new Event("Hillyard Belles", "Saturday", "12:15-1:15 PM"));
        biergartenList.add(new Event("Oom Pa's and Ma's", "Saturday", "1:30-2:30 PM"));
        biergartenList.add(new Event("Perfect Mess", "Saturday", "2:45-4:15 PM"));
        biergartenList.add(new Event("Rusty Jackson Band", "Saturday", "4:30-6:00 PM"));
        biergartenList.add(new Event("The Funk", "Saturday", "6:15-7:45 PM"));
        biergartenList.add(new Event("Oom Pa's and Ma's", "Saturday", "8:00-9:00 PM"));
        biergartenList.add(new Event("Staff Infection", "Saturday", "9:15-10:45 PM"));
        biergartenList.add(new Event("Rhythmic Collective", "Saturday", "11:00 PM-1:00 AM"));
        biergartenList.add(new Event("Cassandra Wheeler", "Sunday", "12:15-1:15 PM"));
        biergartenList.add(new Event("Oom Pa’s and Ma’s", "Sunday", "1:30-2:30 PM"));
        biergartenList.add(new Event("Santos and Scinto", "Sunday", "2:45-4:15 PM"));
        biergartenList.add(new Event("Oom Pa’s and Ma’s", "Sunday", "4:30-5:30 PM"));
        biergartenList.add(new Event("Kosta la Vista", "Sunday", "5:45-7:15 PM"));
        biergartenList.add(new Event("Odessa Open Jam", "Sunday", "7:30-10:00 PM"));

        ListView biergartenListView = (ListView) findViewById(R.id.biergartenListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                biergartenList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = biergartenList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        biergartenListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(BiergartenActivity.this, MapActivity.class);
        intent.putExtra("prevActivity", "stage");
        intent.putExtra("event", "Biergarten");
        startActivityForResult(intent, 1);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(BiergartenActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}