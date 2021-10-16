package io.github.mczeyrox.footballmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
    }
    public void endMatch(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}