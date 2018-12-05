package com.centralkreasi.farhan.elearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MotivasiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivasigambar);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(MotivasiActivity.this, MenuActivity.class));
        finish();
    }
}
