package com.example.week6daily5testassignment;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LruCache;

import java.util.BitSet;

public class MainActivity extends AppCompatActivity {

    int cacheSize = 4 * 1024 *1024;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LruCache<String, Bitmap> bitmapCache = new LruCache<String, Bitmap>(cacheSize){
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount();
            }
        };
    }
}
