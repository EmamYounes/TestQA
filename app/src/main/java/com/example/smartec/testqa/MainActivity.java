package com.example.smartec.testqa;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.SimpleOnItemTouchListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Gallery;
import android.widget.Toast;

import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.LongClick;

public class MainActivity extends AppCompatActivity {

    private PlaceHolderView mGalleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                 mGalleryView = (PlaceHolderView)this.findViewById(R.id.galleryView);
            mGalleryView
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1account),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1call),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1cs),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1doctor),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_eng),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1account),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1doctor),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1cs),getApplicationContext(),mGalleryView))
                    .addView(new GalleryItem(getResources().getDrawable(R.drawable.rsz_1call),getApplicationContext(),mGalleryView));

        }


    }

