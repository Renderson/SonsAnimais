package sonsanimais.renderson.com.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import sonsanimais.renderson.com.R;
import sonsanimais.renderson.com.view.SquareImageView;

/**
 * Created by renderson.silva on 29/01/2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.cachorro,
            R.drawable.macaco,
            R.drawable.vaca,
            R.drawable.coruja,
            R.drawable.ovelha,
            R.drawable.elefante,
            R.drawable.leao,
            R.drawable.gato

    };

    //Construtor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView imageView = new ImageView(mContext);
        SquareImageView imageView = new SquareImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        //imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }
}
