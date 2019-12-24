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

public class FoodDirectoryActivity extends AppCompatActivity {
    List<String> foodDirectoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_directory);

        foodDirectoryList = new ArrayList<String>();
        foodDirectoryList.add("Chiefs Bar & Grill");
        foodDirectoryList.add("Old Town Hall German Bake Sale");
        foodDirectoryList.add("Jonathins");
        foodDirectoryList.add("Reuben Booth");
        foodDirectoryList.add("Corn Booth");
        foodDirectoryList.add("Bratwurst/Fry Booth");
        foodDirectoryList.add("Cabbage Roll Booth");
        foodDirectoryList.add("Apple Strudel Booth");
        foodDirectoryList.add("Shaved Ice Booth");
        foodDirectoryList.add("Das Kraut House");
        foodDirectoryList.add("Granny Bar Bar");
        foodDirectoryList.add("Hamburger Booth");
        foodDirectoryList.add("Any Occasion Banquet Hall Ice Cream");
        foodDirectoryList.add("Pop Booth");
        foodDirectoryList.add("Ice Cream Booth");
        foodDirectoryList.add("Voise Sausage");
        foodDirectoryList.add("Odessa Foods");

        ListView foodDirectoryListView = (ListView) findViewById(R.id.foodDirectoryListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                foodDirectoryList) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String directoryItem = foodDirectoryList.get(position);
                TextView tv1 = (TextView) view.findViewById(android.R.id.text1);
                tv1.setText(directoryItem);
                return view;
            }
        };
        foodDirectoryListView.setAdapter(arrayAdapter);
    }

    public void buttonAction(View view) {
        Intent intent = new Intent(FoodDirectoryActivity.this, FoodMapActivity.class);
        startActivity(intent);
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(FoodDirectoryActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}