package com.example.wehrdscience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherDirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_directory);
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