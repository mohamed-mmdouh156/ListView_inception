package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class myadapter extends BaseAdapter {

    ArrayList<item_obj> items ;
    Context c ;

    public myadapter(ArrayList<item_obj> items , Context context) {
        this.items = items;
        this.c = context ;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public item_obj getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView ;

        if (v == null)
        {
            v = LayoutInflater.from(c).inflate(R.layout.list_item ,null, false);
        }

        ImageView item_img = v.findViewById(R.id.item_img);
        TextView item_text = v.findViewById(R.id.item_tv);
        TextView item_text2 = v.findViewById(R.id.item_description);

        item_obj item =  getItem(position);

        item_img.setImageResource(item.getImg());
        item_text.setText(item.getTitle());
        item_text2.setText(item.getDescription());

        return v;
    }
}
