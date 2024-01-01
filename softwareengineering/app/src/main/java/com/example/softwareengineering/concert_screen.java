package com.example.softwareengineering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class concert_screen extends AppCompatActivity implements RecyclerViewInterface{
    List<item> items=new ArrayList<item>();
    String eventName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_screen);


        items.add(new item("ZEYNEP BASTIK",R.drawable.zeynep));
        items.add(new item("ANIL PIYANCI",R.drawable.ap));
        items.add(new item("EDIS",R.drawable.edis));
        items.add(new item("NF", R.drawable.nf));
        RecyclerView recyclerView=findViewById(R.id.recylcerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items,this));
    }

    @Override
    public void OnItemClick(int position) {
        eventName=items.get(position).getName();
        Intent intent= new Intent(concert_screen.this,chairsActivity.class);
        /*intent.putExtra();*/
        startActivity(intent);
       /* if (items.get(position).getName().equals("ZEYNEP BASTIK")){
            startActivity(new Intent(concert_screen.this,chairsActivity.class));

        }else if (items.get(position).getName().equals("ANIL PIYANCI"))
        {
            startActivity(new Intent(concert_screen.this,AP_Chairs.class));


        } else if (items.get(position).getName().equals("EDIS")) {
            startActivity(new Intent(concert_screen.this,EdisChairs.class));


        }else {
            startActivity(new Intent(concert_screen.this, NFChairs.class));

        }*/


    }
}