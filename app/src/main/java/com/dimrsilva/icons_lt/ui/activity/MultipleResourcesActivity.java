package com.dimrsilva.icons_lt.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dimrsilva.icons_lt.R;

public class MultipleResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        for (int i = 0; i < 20000; i++) {
            ImageView imageView = new ImageView(this);
            Drawable drawable;
            if (i % 3 == 0) {
                drawable = ContextCompat.getDrawable(this, R.drawable.ic_account_circle_red);
            } else if (i % 3 == 1){
                drawable = ContextCompat.getDrawable(this, R.drawable.ic_account_circle_green);
            } else {
                drawable = ContextCompat.getDrawable(this, R.drawable.ic_account_circle_blue);
            }

            imageView.setImageDrawable(drawable);
            linearLayout.addView(imageView);
        }
    }
}
