package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodDirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_directory);
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