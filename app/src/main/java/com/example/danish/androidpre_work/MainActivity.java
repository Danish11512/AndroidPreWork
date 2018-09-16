package com.example.danish.androidpre_work;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.danish.androidpre_work.R.color.colorPrimaryDark;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.backgroundView).setBackgroundColor(
                        getResources().getColor(colorPrimaryDark));
            }
        });

        // grab text
        // put the text into text view with button
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ((EditText) findViewById(R.id.input)).getText().toString();

                if (TextUtils.isEmpty(text)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Danish!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(text);
                }
            }
        });

        findViewById(R.id.backgroundView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Text Color

                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                // Background Color

                findViewById(R.id.backgroundView).setBackgroundColor(
                        getResources().getColor(R.color.green));
                // Original Color

                ((TextView) findViewById(R.id.textView)).setText("Hello From Danish!");
            }
        });


    }
}
