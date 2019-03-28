package com.example.mg.minpojobun3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        //add some items
        adapter.add("総則");
        adapter.add("第一章　通則");
        adapter.add("第二章　人");
        adapter.add("　第一節　権利能力");
        adapter.add("　第二節　意思能力");
        adapter.add("　第三節　行為能力");
        adapter.add("　第四節　住所");
        adapter.add("　第五節　不在者の財産の管理及び失踪の宣告");
        adapter.add("　第六節　同時死亡の推定");
        adapter.add("第三章　法人");
        adapter.add("第四章　物");
        adapter.add("第五章　法律行為");
        adapter.add("　第一節　総則");
        adapter.add("　第二節　意思表示"); //0から数えて13番目
        adapter.add("　第三節　代理");
        adapter.add("　第四節　無効及び取消し");
        adapter.add("　第五節　条件及び期限");


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
                    case 13:

                    // 第2引数は適宜
                    Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(intent);

                    break;
                }


            }
        });



    }
}
