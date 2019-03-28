package com.example.mg.minpojobun3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        //add some items
        adapter.add("意思表示");
        adapter.add("　第九十三条（心裡留保）");
        adapter.add("　第九十四条（虚偽表示）");
        adapter.add("　第九十五条（錯誤）");
        adapter.add("　第九十六条（詐欺又は強迫）");//0から数えて4番目
        adapter.add("　第九十七条（意思表示の効力発生時期等）");
        adapter.add("　第九十八条（公示による意思表示）");


        ListView listView = (ListView) findViewById(R.id.listView1);
        //ListView set ArrayAdapter
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // ListView
                ListView listView = (ListView)parent;
                // 選択された項目
                String selectedItemStr = (String)listView.getItemAtPosition(position);

                switch(position) {
                    case 4:

                        // 第2引数は適宜
                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                        startActivity(intent);

                        break;
                }


            }
        });



    }
}
