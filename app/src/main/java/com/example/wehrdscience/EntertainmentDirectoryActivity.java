/**
 * Created by Elizabeth on 4/20/2017.
 * Updated by Elizabeth on 12/23/2019.
 */

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

public class EntertainmentDirectoryActivity extends AppCompatActivity {
    List<String> entertainmentDirectoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_directory);

        entertainmentDirectoryList = new ArrayList<String>();
        entertainmentDirectoryList.add("Chalk Drawing");
        entertainmentDirectoryList.add("Tricycle Race, Bed Races, and Parade");
        entertainmentDirectoryList.add("Biergarten");
        entertainmentDirectoryList.add("Book Sale");
        entertainmentDirectoryList.add("St. Matthew's Church");
        entertainmentDirectoryList.add("Odessa High School FBLA Vendor Street Fair");
        entertainmentDirectoryList.add("Rocky Coulee Brewery");
        entertainmentDirectoryList.add("Historical Museum");
        entertainmentDirectoryList.add("Finney Field");
        entertainmentDirectoryList.add("Odessa Golf & RV");
        entertainmentDirectoryList.add("Odessa City Park");
        entertainmentDirectoryList.add("Rolling Thunder");
        entertainmentDirectoryList.add("St Joseph's Catholic Church");
        entertainmentDirectoryList.add("Outdoor Stage");
        entertainmentDirectoryList.add("Zion Emmanuel Lutheran Church");
        entertainmentDirectoryList.add("Information Booth");
        entertainmentDirectoryList.add("Heritage Church");
        entertainmentDirectoryList.add("Christ Lutheran Church");
        entertainmentDirectoryList.add("Four Square Church");
        entertainmentDirectoryList.add("Flea Market");
        entertainmentDirectoryList.add("School Playground");
        entertainmentDirectoryList.add("City Park Playground");
        entertainmentDirectoryList.add("ATM");

        ListView entertainmentDirectoryListView = (ListView) findViewById(R.id.entertainmentDirectoryListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                entertainmentDirectoryList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String directoryItem = entertainmentDirectoryList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(directoryItem);
                return view;
            }
        };
        entertainmentDirectoryListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(EntertainmentDirectoryActivity.this, EntertainmentMapActivity.class);
        startActivity(intent);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(EntertainmentDirectoryActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}