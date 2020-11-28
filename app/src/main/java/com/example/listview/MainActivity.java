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

        list_item.add(new item_obj(R.drawable.profile,"Mohamed Mmdouh" , "01123780390"));
        list_item.add(new item_obj(R.drawable.profile,"Ahmed Mmdouh" , "0112000555"));
        list_item.add(new item_obj(R.drawable.profile,"Mahmoud Mmdouh" , "0112000333"));
        list_item.add(new item_obj(R.drawable.profile,"Sara Ahmed" , "0112000444"));
        list_item.add(new item_obj(R.drawable.profile , "Fareda Mohamed" ,"0112000555"));
        list_item.add(new item_obj(R.drawable.profile , "Ahmed Mohamed" ,"0112000666"));
        list_item.add(new item_obj(R.drawable.profile , "Adam Mohamed" ,"0112000777"));
        list_item.add(new item_obj(R.drawable.profile , "Ali Mohamed" ,"0112000888"));


        myadapter adapter = new myadapter(list_item , this);

        listView.setAdapter(adapter);


    }
}