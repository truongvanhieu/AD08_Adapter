package com.android.hkh.ad08_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView myListView;
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step1. Link listview
        myListView = (ListView) findViewById(R.id.listview);

        //step2. Define Data source
        ArrayList<String> myArrayData = new ArrayList<>();
        myArrayData.add("Mì Quảng");// add data to arraylist
        myArrayData.add("Bánh xèo");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        myArrayData.add("Thịt heo bánh tráng");
        myArrayData.add("Bê thui cầu móng");
        //step3. Define new Adapter
        myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArrayData);
        //step4. Assign adapter to listview
        myListView.setAdapter(myAdapter);
        //step5. Set listvew listener
        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("ListViewDemo", "position:"+position +", id:"+id);
        String st = myAdapter.getItem(position);
        Toast.makeText(MainActivity.this, st, Toast.LENGTH_SHORT).show();
    }
}
