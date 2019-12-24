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

public class OtherDirectoryActivity extends AppCompatActivity {
    List<String> otherDirectoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_directory);

        otherDirectoryList = new ArrayList<String>();
        otherDirectoryList.add("Public Restroom");
        otherDirectoryList.add("School Restroom");
        otherDirectoryList.add("Park Restroom");
        otherDirectoryList.add("Odessa Mini Park");
        otherDirectoryList.add("La Collage Inn");
        otherDirectoryList.add("OHS Baseball Field");

        ListView otherDirectoryListView = (ListView) findViewById(R.id.otherDirectoryListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                otherDirectoryList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String directoryItem = otherDirectoryList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(directoryItem);
                return view;
            }
        };
        otherDirectoryListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(OtherDirectoryActivity.this, OtherMapActivity.class);
        startActivity(intent);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(OtherDirectoryActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}