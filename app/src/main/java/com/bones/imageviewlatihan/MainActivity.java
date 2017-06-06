package com.bones.imageviewlatihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int current_image;
    ImageView image_view_obj;
    int[] images = {R.drawable.android_one, R.drawable.android_two, R.drawable.android_three};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_back = (Button)findViewById(R.id.btn_back);
        Button btn_next = (Button)findViewById(R.id.btn_next);
        image_view_obj = (ImageView)findViewById(R.id.image_view);

        current_image = 0;

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_image == 0) {
                    current_image = images.length;
                } else {
                    current_image--;
                }
                current_image = current_image % images.length;
                image_view_obj.setImageResource(images[current_image]);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++;
                current_image = current_image % images.length;
                image_view_obj.setImageResource(images[current_image]);
            }
        });

    }
}
