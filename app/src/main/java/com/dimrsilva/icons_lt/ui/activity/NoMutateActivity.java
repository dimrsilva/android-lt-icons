package com.dimrsilva.icons_lt.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dimrsilva.icons_lt.R;

public class NoMutateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        for (int i = 0; i < 2000; i++) {
            ImageView imageView = new ImageView(this);
            Drawable drawable = DrawableCompat.wrap(ContextCompat.getDrawable(this, R.drawable.ic_account_circle));
            if (i % 3 == 0) {
                DrawableCompat.setTint(drawable, ContextCompat.getColor(this, R.color.red));
            } else if (i % 3 == 1){
                DrawableCompat.setTint(drawable, ContextCompat.getColor(this, R.color.green));
            } else {
                DrawableCompat.setTint(drawable, ContextCompat.getColor(this, R.color.blue));
            }

            imageView.setImageDrawable(drawable);
            linearLayout.addView(imageView);
        }
    }
}
