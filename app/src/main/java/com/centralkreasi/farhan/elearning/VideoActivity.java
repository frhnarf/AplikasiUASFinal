package com.centralkreasi.farhan.elearning;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
                VideoView video = (VideoView)findViewById(R.id.videoView);
                Uri lokasiVideo=Uri.parse("android:resource://"+getPackageName()+"/"+R.raw.contoh);
                video.setVideoURI(lokasiVideo);
                video.start();
    }
}