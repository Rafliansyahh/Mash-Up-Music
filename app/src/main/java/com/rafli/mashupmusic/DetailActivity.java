package com.rafli.mashupmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvJudul, tvKeterangan;
    private YouTubePlayerView ypvVideo;
    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tv_judul);
        tvKeterangan = findViewById(R.id.tv_keterangan);
        ypvVideo = findViewById(R.id.ypv_video);

    }
}