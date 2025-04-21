package com.surajvanshsv.marketapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    // 1 - Adapeter view
    RecyclerView recyclerView;

    // 2 - Data Source
    List<items> itemList;

    // 3 - Adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerView);

        itemList = new ArrayList<>();
        items item1 = new items(R.drawable.fruit, "Fruits","Fresh Fruits from the Garden");
        items item2 = new items(R.drawable.vegitables, "Vegetables","Delicious Vegetables ");
        items item3 = new items(R.drawable.bread,"Bakery","Bread, Wheat and Beans");
        items item4 = new items(R.drawable.beverage, "Beverage","Juice, Tea, Coffee and Soda");
        items item5 = new items(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt");
        items item6 = new items(R.drawable.popcorn,"Snacks","Pop Corn, Donut and Drinks");


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this,
                "You Choose:" + itemList.get(pos).getItemName(),
        Toast.LENGTH_SHORT).show();
    }
}