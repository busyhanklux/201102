package com.example.a201102;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t_play,t_song;
    private ImageButton I_front,I_stop,I_play,I_pause,I_next,I_end;
    private ListView LV;
    public MediaPlayer mediaPlayer;
    private final String SONGPATH = "sdcard/";

    //歌名
    String[] songname = new String[]
            {"greensleeves","mario","songbird","summersong","tradewinds"};

    //String[] songfile = new String[]
    // {"greensleeves.mp3","mario.mp3","songbird.mp3","summersong.mp3","tradewinds.mp3"};

    //歌曲資源
    int[] songfile = new int[]
            {R.raw.greensleeves,R.raw.mario,R.raw.songbird,R.raw.summersong,R.raw.tradewinds};
    private int song_number = 0;        //目前播放歌曲
    private Boolean flagPause = false;  //暫停，播放

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t_play = findViewById(R.id.txt_play);
        t_song = findViewById(R.id.txt_song);

        I_front = findViewById(R.id.img_front);
        I_stop  = findViewById(R.id.img_stop);
        I_play  = findViewById(R.id.img_play);
        I_pause = findViewById(R.id.img_pause);
        I_next  = findViewById(R.id.img_next);
        I_end   = findViewById(R.id.img_end);

        LV = findViewById(R.id.LV);

        I_front.setOnClickListener(Li);
        I_stop.setOnClickListener(Li);
        I_play.setOnClickListener(Li);
        I_pause.setOnClickListener(Li);
        I_next.setOnClickListener(Li);
        I_end.setOnClickListener(Li);

        //LV.setOnItemClickListener(Lis);

        mediaPlayer=new MediaPlayer();
        ArrayAdapter<String> adaSong=
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songname);
        LV.setAdapter(adaSong);
    }

    //下一首歌
    private void nextSong(){
        song_number++;
        if (song_number >= LV.getCount()) //若到最後就移到第一首
            song_number = 0;
        //playSong(songfile[song_number]);
    }

    private ImageButton.OnClickListener Li = new ImageButton.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.img_front:
            }
    }};
}