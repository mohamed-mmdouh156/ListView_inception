package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        ArrayList <item_obj> list_item = new ArrayList<>();

        list_item.add(new item_obj(R.drawable.facebook ,"Facebook"));
        list_item.add(new item_obj(R.drawable.twitter ,"Twitter"));
        list_item.add(new item_obj(R.drawable.instagram ,"Instagram"));
        list_item.add(new item_obj(R.drawable.whatsapp ,"Whatsapp"));
        list_item.add(new item_obj(R.drawable.snapchat ,"Snapchat"));

        myadapter adapter = new myadapter(list_item , this);

        listView.setAdapter(adapter);


    }
}