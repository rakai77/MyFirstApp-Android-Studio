package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import static android.widget.Toast.LENGTH_SHORT;

public class    DetailHero extends AppCompatActivity {
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DETAIL = "extra_detail";
    public static String EXTRA_PHOTO = "extra_photo";
    private View.OnClickListener onClickListener;

    ImageView imgPhoto;
    TextView tvName, tvDetail;
    Button btn_attribute;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);

        imgPhoto = findViewById(R.id.img_hero);
        tvName = findViewById(R.id.tv_name_hero);
        tvDetail = findViewById(R.id.tv_detail_hero);

        setData();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_attribute = findViewById(R.id.btn_attribute);
        setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Toast.makeText(getApplicationContext(), "Directing to the link  ", LENGTH_SHORT).show();
               Intent btnView = new Intent("android.intent.action.VIEW", Uri.parse("https://www.marvel.com/characters"));
               startActivities(btnView);
           }

            private Intent startActivities(Intent btnView) {
               return btnView;
            }
        });

    }

    private void setData() {
        Intent intent = getIntent();

        String nameHero = intent.getStringExtra(EXTRA_NAME);
        tvName.setText(nameHero);

        String detailHero = intent.getStringExtra(EXTRA_DETAIL);
        tvDetail.setText(detailHero);

        int photoHero = intent.getIntExtra(String.valueOf(EXTRA_PHOTO),0);
        Glide.with(this)
                .load(photoHero)
                .apply(new RequestOptions().override(552,475))
                .into(imgPhoto);

    }
}