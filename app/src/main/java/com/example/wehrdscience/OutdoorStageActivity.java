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

public class OutdoorStageActivity extends AppCompatActivity {
    List<Event> outdoorStageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_stage);

        outdoorStageList = new ArrayList<Event>();
        outdoorStageList.add(new Event("Nick Garcia", "Friday", "11:00 AM-12:00 PM"));
        outdoorStageList.add(new Event("Thad Striffler", "Friday", "12:00-1:00 PM"));
        outdoorStageList.add(new Event("Cecil’s Magic (brought to you by RJ Exploration & Drilling Company & GO! Odessa Recreation)", "Friday", "1:00-2:00 PM"));
        outdoorStageList.add(new Event("Nicolas Nelson", "Friday", "2:00-3:00 PM"));
        outdoorStageList.add(new Event("Chris Leffler", "Friday", "3:00-4:00 PM"));
        outdoorStageList.add(new Event("Best Kuchen Contest", "Friday", "4:00-4:30 PM"));
        outdoorStageList.add(new Event("Best Pickle Contest", "Friday", "4:30-5:00 PM"));
        outdoorStageList.add(new Event("General Disarray", "Friday", "5:00-6:00 PM"));
        outdoorStageList.add(new Event("Spring Chicks", "Saturday", "11:00 AM-12:00 PM"));
        outdoorStageList.add(new Event("Ugly Beard Contest", "Saturday", "12:00-12:30 PM"));
        outdoorStageList.add(new Event("Cutest Dog Contest", "Saturday", "12:30-1:00 PM"));
        outdoorStageList.add(new Event("Nick Garcia", "Saturday", "1:00-2:00 PM"));
        outdoorStageList.add(new Event("Cindy Smith", "Saturday", "2:00-3:00 PM"));
        outdoorStageList.add(new Event("Oom Pa’s and Ma’s", "Saturday", "3:00-4:00 PM"));
        outdoorStageList.add(new Event("4th Annual Tim Hauge Talent Show", "Saturday", "4:00-5:00 PM"));
        outdoorStageList.add(new Event("Evan Gonzales", "Saturday", "5:00-6:00 PM"));
        outdoorStageList.add(new Event("General Disarray", "Saturday", "6:00-7:00 PM"));
        outdoorStageList.add(new Event("The Campbells", "Sunday", "12:00-1:00 PM"));
        outdoorStageList.add(new Event("Pastor Jon", "Sunday", "1:00-2:00 PM"));

        ListView outdoorStageListView = (ListView) findViewById(R.id.outdoorStageListView);
        ArrayAdapter<Event> arrayAdapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                outdoorStageList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                Event event = outdoorStageList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(event.getName());
                TextView tv2 = (TextView) view.findViewById(android.R.id.text2);
                tv2.setText(event.toString());
                return view;
            }
        };
        outdoorStageListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(OutdoorStageActivity.this, MapActivity.class);
        intent.putExtra("prevActivity", "stage");
        intent.putExtra("event", "Outdoor Stage");
        startActivityForResult(intent, 1);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(OutdoorStageActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}