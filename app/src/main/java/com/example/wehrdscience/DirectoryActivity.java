/**
 * Created by Elizabeth on 4/20/2017.
 * Updated by Elizabeth on 12/22/2019.
 */

package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
    }

    public void buttonAction(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Food")) {
            Intent intent = new Intent(DirectoryActivity.this, FoodDirectoryActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Entertainment")) {
            Intent intent = new Intent(DirectoryActivity.this, EntertainmentDirectoryActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Other")) {
            Intent intent = new Intent(DirectoryActivity.this, OtherDirectoryActivity.class);
            startActivity(intent);
        }
    }

    public void goBackHome(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Home")) {
            Intent homeIntent = new Intent(DirectoryActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }
    }
}