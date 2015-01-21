package net.jamesmallen.afterdark;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;


public class LoopingVideoActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {

    VideoView videoView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looping_video);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Intent intent = getIntent();
        int videoId = intent.getIntExtra(MainActivity.EXTRA_VIDEO_ID, -1);

        videoView = (VideoView) findViewById(R.id.videoView);

        String videoPath = "android.resource://" + getPackageName() + "/" + videoId;


        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.setOnCompletionListener(this);
        videoView.setOnPreparedListener(this);

        videoView.start();


    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        // noop
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.setLooping(true);
    }

}
