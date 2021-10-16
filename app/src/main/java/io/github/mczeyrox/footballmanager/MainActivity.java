package io.github.mczeyrox.footballmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import io.github.mczeyrox.footballmanager.utility.DataContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //DataContainer.init();

        setContentView(R.layout.activity_main);
    }

    public void startMatch(View view) {
        Intent intent = new Intent(this, Match.class);
        startActivity(intent);
    }
}