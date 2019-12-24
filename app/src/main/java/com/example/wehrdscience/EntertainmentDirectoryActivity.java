/**
 * Created by Elizabeth on 4/20/2017.
 * Updated by Elizabeth on 12/23/2019.
 */

package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntertainmentDirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_directory);
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