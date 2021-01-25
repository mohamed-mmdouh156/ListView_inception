package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        final ArrayList <item_obj> list_item = new ArrayList<>();

        list_item.add(new item_obj(R.drawable.profile,"Mohamed Mmdouh" , "01123780390"));
        list_item.add(new item_obj(R.drawable.profile,"Ahmed Mmdouh" , "0112000555"));
        list_item.add(new item_obj(R.drawable.profile,"Mahmoud Mmdouh" , "0112000333"));
        list_item.add(new item_obj(R.drawable.profile,"Sara Ahmed" , "0112000444"));
        list_item.add(new item_obj(R.drawable.profile , "Fareda Mohamed" ,"0112000555"));
        list_item.add(new item_obj(R.drawable.profile , "Ahmed Mohamed" ,"0112000666"));
        list_item.add(new item_obj(R.drawable.profile , "Adam Mohamed" ,"0112000777"));
        list_item.add(new item_obj(R.drawable.profile , "Ali Mohamed" ,"0112000888"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        String number = list_item.get(position).getDescription();

                        Intent call_intent = new Intent();

                        call_intent.setAction(call_intent.ACTION_DIAL);

                        Uri uri = Uri.parse("tel:"+number);
                        call_intent.setData(uri);

                        startActivity(call_intent);
                        break;

                    case 1:
                        String number1 = list_item.get(position).getDescription();

                        Intent call_intent1 = new Intent();

                        call_intent1.setAction(call_intent1.ACTION_DIAL);

                        Uri uri1 = Uri.parse("tel:"+number1);
                        call_intent1.setData(uri1);

                        startActivity(call_intent1);
                        break;

                    case 2:
                        String number2 = list_item.get(position).getDescription();

                        Intent call_intent2 = new Intent();

                        call_intent2.setAction(call_intent2.ACTION_DIAL);

                        Uri uri2 = Uri.parse("tel:"+number2);
                        call_intent2.setData(uri2);

                        startActivity(call_intent2);
                        break;

                    case 3:
                        String number3 = list_item.get(position).getDescription();

                        Intent call_intent3 = new Intent();

                        call_intent3.setAction(call_intent3.ACTION_DIAL);

                        Uri uri3 = Uri.parse("tel:"+number3);
                        call_intent3.setData(uri3);

                        startActivity(call_intent3);
                        break;

                    case 4:
                        String number4 = list_item.get(position).getDescription();

                        Intent call_intent4 = new Intent();

                        call_intent4.setAction(call_intent4.ACTION_DIAL);

                        Uri uri4 = Uri.parse("tel:"+number4);
                        call_intent4.setData(uri4);

                        startActivity(call_intent4);
                        break;

                    case 5:
                        String number5 = list_item.get(position).getDescription();

                        Intent call_intent5 = new Intent();

                        call_intent5.setAction(call_intent5.ACTION_DIAL);

                        Uri uri5 = Uri.parse("tel:"+number5);
                        call_intent5.setData(uri5);

                        startActivity(call_intent5);
                        break;

                    case 6:
                        String number6 = list_item.get(position).getDescription();

                        Intent call_intent6 = new Intent();

                        call_intent6.setAction(call_intent6.ACTION_DIAL);

                        Uri uri6 = Uri.parse("tel:"+number6);
                        call_intent6.setData(uri6);

                        startActivity(call_intent6);
                        break;

                    case 7:
                        String number7 = list_item.get(position).getDescription();

                        Intent call_intent7 = new Intent();

                        call_intent7.setAction(call_intent7.ACTION_DIAL);

                        Uri uri7 = Uri.parse("tel:"+number7);
                        call_intent7.setData(uri7);

                        startActivity(call_intent7);
                        break;




                }

            }
        });


        myadapter adapter = new myadapter(list_item , this);

        listView.setAdapter(adapter);


    }
}