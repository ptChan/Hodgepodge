package com.ptchan.hodgepodge.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ptchan.hodgepodge.R;
import com.ptchan.hodgepodge.photoWall.PhotosWall;
import com.ptchan.hodgepodge.photoWallFalls.PhotoWallFalls;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements View.OnClickListener {
    public static final String TAG = "MainActivity";
    @BindView(R.id.btn_bk)
    Button btnBk;
    private Button btnPhotosWall;
    private Button btnPhotoWallFalls;
    private Button btnPicLoad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        ButterKnife.bind(this);
        setContentView(R.layout.activity_main);
        btnPhotosWall = (Button) findViewById(R.id.btn_photos_wall);
        btnPhotosWall.setOnClickListener(this);
        btnPhotoWallFalls = (Button) findViewById(R.id.btn_photo_wall_falls);
        btnPhotoWallFalls.setOnClickListener(this);
        btnPicLoad = (Button) findViewById(R.id.btn_pic_load);
        btnPicLoad.setOnClickListener(this);
        onClick();
//        btnBk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_photos_wall:
                startActivity(new Intent(MainActivity.this, PhotosWall.class));
                break;
            case R.id.btn_photo_wall_falls:
                startActivity(new Intent(MainActivity.this, PhotoWallFalls.class));
                break;
            case R.id.btn_pic_load:
                startActivity(new Intent(MainActivity.this, PicLoadActivity.class));
                break;
            default:
                break;
        }
    }

    @OnClick(R.id.btn_bk)
    public void onClick() {
        startActivity(new Intent(MainActivity.this,TestForButterKnife.class));
    }
}
