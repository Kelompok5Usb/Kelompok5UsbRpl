package com.example.incasoq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuutama extends AppCompatActivity {

    ImageButton cafe1,cafe2,cafe3,cafe4,cafe5,cafe6,cafe7,cafe8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        cafe1 = (ImageButton) findViewById(R.id.cafe1);
        cafe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe1.class);
                startActivity(intent);
            }
        });
        cafe2 = (ImageButton) findViewById(R.id.cafe2);
        cafe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe2.class);
                startActivity(intent);
            }
        });
        cafe3 = (ImageButton) findViewById(R.id.cafe3);
        cafe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe3.class);
                startActivity(intent);
            }
        });
        cafe4 = (ImageButton) findViewById(R.id.cafe4);
        cafe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe4.class);
                startActivity(intent);

            }
        });
        cafe5 = (ImageButton) findViewById(R.id.cafe5);
        cafe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe5.class);
                startActivity(intent);
            }
        });
        cafe6 = (ImageButton) findViewById(R.id.cafe6);
        cafe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe6.class);
                startActivity(intent);
            }
        });
        cafe7 = (ImageButton) findViewById(R.id.cafe7);
        cafe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe7.class);
                startActivity(intent);
            }
        });
        cafe8 = (ImageButton) findViewById(R.id.cafe8);
        cafe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama.this, cafe8.class);
                startActivity(intent);
    }
});
    }
}
