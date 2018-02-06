package sonsanimais.renderson.com;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import java.io.IOException;

import sonsanimais.renderson.com.R;

import sonsanimais.renderson.com.adapter.ImageAdapter;

/**
 * Created by renderson.silva on 29/01/2018.
 */

public class AndroidGridlayoutActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener{

    public MediaPlayer mp;
    public MediaPlayer mp1;
    public MediaPlayer mp2;
    public MediaPlayer mp3;
    public MediaPlayer mp4;
    public MediaPlayer mp5;
    public MediaPlayer mp6;
    public MediaPlayer mp7;

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);



        mp = MediaPlayer.create(this, R.raw.cao);
        mp1 = MediaPlayer.create(this, R.raw.macaco);
        mp2 = MediaPlayer.create(this, R.raw.vaca);
        mp3 = MediaPlayer.create(this, R.raw.coruja);
        mp4 = MediaPlayer.create(this, R.raw.ovelha);
        mp5 = MediaPlayer.create(this, R.raw.elefante);
        mp6 = MediaPlayer.create(this, R.raw.leao);
        mp7 = MediaPlayer.create(this, R.raw.gato);


        GridView gridView = (GridView)findViewById(R.id.grid_view);

        //Instance of ImageAdapter class
        gridView.setAdapter(new ImageAdapter(this));

        /**
         * On Click event for Single Gridview Item
         * */

        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                //passing array index
                i.putExtra("id", position);
                startActivity(i);

                switch (position) {
                    case 0:
                        mp.start();
                        break;

                    case 1:
                        mp1.start();
                        break;

                    case 2:
                        mp2.start();
                        break;


                    case 3:
                        mp3.start();
                        break;

                    case 4:
                        mp4.start();
                        break;

                    case 5:
                        mp5.start();
                        break;

                    case 6:
                        mp6.start();
                        break;

                    case 7:
                        mp7.start();
                        break;
                }

            }
        });

    }

   @Override
    public void onCompletion(MediaPlayer mp) {}

}
