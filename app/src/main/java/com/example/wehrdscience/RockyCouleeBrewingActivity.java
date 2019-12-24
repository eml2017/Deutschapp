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

public class RockyCouleeBrewingActivity extends AppCompatActivity {
    List<Event> rockyCouleeBrewingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocky_coulee_brewing);

        rockyCouleeBrewingList = new ArrayList<Event>();
        rockyCouleeBrewingList.add(new Event("Free Beer Nuts", "Saturday", "6:30 PM"));

        ListView rockyCouleeBrewingListView = (ListView) findViewById(R.id.rockyCouleeBrewingListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                rockyCouleeBrewingList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = rockyCouleeBrewingList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        rockyCouleeBrewingListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(RockyCouleeBrewingActivity.this, MapActivity.class);
        intent.putExtra("prevActivity", "stage");
        intent.putExtra("event", "Rocky Coulee Brewing");
        startActivityForResult(intent, 1);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(RockyCouleeBrewingActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}