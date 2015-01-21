package net.jamesmallen.afterdark;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.HashMap;


public class MainActivity extends Activity {

    HashMap videoMap;

    public final static String EXTRA_VIDEO_ID = "net.jamesmallen.afterdark.VIDEO_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        videoMap = new HashMap();

        videoMap.put(R.id.button_artist, R.raw.artist);
        videoMap.put(R.id.button_baddog, R.raw.baddog);
        videoMap.put(R.id.button_bugs, R.raw.bugs);
        videoMap.put(R.id.button_daredevildan, R.raw.daredevildan);
        videoMap.put(R.id.button_dosshell, R.raw.dosshell);
        videoMap.put(R.id.button_fishpro, R.raw.fishpro);
        videoMap.put(R.id.button_flyingtoasterspro, R.raw.flyingtoasterspro);
        videoMap.put(R.id.button_flyingtoilets, R.raw.flyingtoilets);
        videoMap.put(R.id.button_frostandfire, R.raw.frostandfire);
        videoMap.put(R.id.button_guts, R.raw.guts);
        videoMap.put(R.id.button_logo, R.raw.logo);
        videoMap.put(R.id.button_nirvana, R.raw.nirvana);
        videoMap.put(R.id.button_nonsense, R.raw.nonsense);
        videoMap.put(R.id.button_photon, R.raw.photon);
        videoMap.put(R.id.button_ratrace, R.raw.ratrace);
        videoMap.put(R.id.button_ray, R.raw.ray);
        videoMap.put(R.id.button_rebound, R.raw.rebound);
        videoMap.put(R.id.button_rose, R.raw.rose);
        videoMap.put(R.id.button_satori, R.raw.satori);
        videoMap.put(R.id.button_spheres, R.raw.spheres);
        videoMap.put(R.id.button_spotlight, R.raw.spotlight);
        videoMap.put(R.id.button_warp, R.raw.warp);
        videoMap.put(R.id.button_youbetyourhead, R.raw.youbetyourhead);
        videoMap.put(R.id.button_zooommm, R.raw.zooommm);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openVideo(View view) {
        int buttonId = view.getId();
        int videoId = (int) videoMap.get(buttonId);

        Intent intent = new Intent(this, LoopingVideoActivity.class);
        intent.putExtra(EXTRA_VIDEO_ID, videoId);
        startActivity(intent);

    }
}
