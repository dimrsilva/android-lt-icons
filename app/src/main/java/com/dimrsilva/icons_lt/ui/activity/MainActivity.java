package com.dimrsilva.icons_lt.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dimrsilva.icons_lt.R;

public class MainActivity extends AppCompatActivity {

    public static final int IMAGE_VIEWS_COUNT = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_no_mutate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NoMutateActivity.class));
            }
        });

        findViewById(R.id.btn_mutate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MutateActivity.class));
            }
        });

        findViewById(R.id.btn_multiple_resources).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MultipleResourcesActivity.class));
            }
        });

        findViewById(R.id.btn_cached_drawable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CachedDrawableActivity.class));
            }
        });
    }
}
