package com.example.assignments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomAdapter extends BaseAdapter {

    String[] title;
    String[] subtitle;
    Integer[] img;
    Context context;

    public CustomAdapter(@NonNull Context context, String[] title, String[] subtitle, Integer[] img) {
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.img = img;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view, parent, false);

        }
        TextView t = convertView.findViewById(R.id.title);

        ImageView imageView = convertView.findViewById(R.id.imageView);

        t.setText(title[position]);

        imageView.setImageResource(img[position]);

        return convertView;
    }
}