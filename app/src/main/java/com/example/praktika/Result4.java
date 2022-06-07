package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class Result4 extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result4);

        txt = (TextView) findViewById(R.id.textView5);

        SharedPreferences pref= PreferenceManager.getDefaultSharedPreferences(Result4.this);
        txt.setText(pref.getString("test5", ""));
    }

    public void NextClick(View view) {
        Intent intent = new Intent(this, CirRaspCoef.class);
        startActivity(intent);
    }
}