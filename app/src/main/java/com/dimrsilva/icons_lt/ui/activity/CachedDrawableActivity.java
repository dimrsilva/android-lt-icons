package com.dimrsilva.icons_lt.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dimrsilva.icons_lt.R;

public class CachedDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        Drawable drawableRed = DrawableCompat.wrap(ContextCompat.getDrawable(this, R.drawable.ic_account_circle));
        drawableRed.mutate();
        DrawableCompat.setTint(drawableRed, ContextCompat.getColor(this, R.color.red));

        Drawable drawableGreen = DrawableCompat.wrap(ContextCompat.getDrawable(this, R.drawable.ic_account_circle));
        drawableGreen.mutate();
        DrawableCompat.setTint(drawableGreen, ContextCompat.getColor(this, R.color.green));

        Drawable drawableBlue = DrawableCompat.wrap(ContextCompat.getDrawable(this, R.drawable.ic_account_circle));
        drawableBlue.mutate();
        DrawableCompat.setTint(drawableBlue, ContextCompat.getColor(this, R.color.blue));

        for (int i = 0; i < MainActivity.IMAGE_VIEWS_COUNT; i++) {
            ImageView imageView = new ImageView(this);
            Drawable drawable;
            if (i % 3 == 0) {
                drawable = drawableRed;
            } else if (i % 3 == 1){
                drawable = drawableGreen;
            } else {
                drawable = drawableBlue;
            }

            imageView.setImageDrawable(drawable);
            linearLayout.addView(imageView);
        }
    }
}
