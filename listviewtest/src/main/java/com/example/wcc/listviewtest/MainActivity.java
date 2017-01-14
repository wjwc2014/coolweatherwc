package com.example.wcc.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();

//    private List<Fruit> fruitList = new ArrayList<Fruit>();
//    private  String[] data = { "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MainActivity.this,android.R.layout.simple_list_item_1,data
//        );
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

//        initFruits(); // 初始化水果数据
//        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
//                R.layout.fruit_item, fruitList);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Fruit fruit = fruitList.get(position);
//                Toast.makeText(MainActivity.this, fruit.getName(),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });


        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter(MainActivity.this, R.layout.msg_item, msgList);
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgListView = (ListView) findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg msg = new Msg(content, Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged(); // 当有新消息时,刷新
                    msgListView.setSelection(msgList.size()); // 将ListView
                    inputText.setText(""); // 清空输入框中的内容
                }
            }
        });

    }

    private void initMsgs() {
        Msg msg1 = new Msg("Hello guy.", Msg.TYPE_RECEIVED); msgList.add(msg1);
        Msg msg2 = new Msg("Hello. Who is that?", Msg.TYPE_SENT); msgList.add(msg2);
        Msg msg3 = new Msg("This is Tom. Nice talking to you. ", Msg.TYPE_RECEIVED); msgList.add(msg3);
    }
//    private void initFruits() {
//        Fruit apple = new Fruit("Apple", R.mipmap.ic_launcher);
//        fruitList.add(apple);
//        Fruit banana = new Fruit("Banana", R.mipmap.ic_launcher);
//        fruitList.add(banana);
//        Fruit orange = new Fruit("Orange", R.mipmap.ic_launcher);
//        fruitList.add(orange);
//        Fruit watermelon = new Fruit("Watermelon", R.mipmap.ic_launcher);
//        fruitList.add(watermelon);
//        Fruit pear = new Fruit("Pear", R.mipmap.ic_launcher);
//        fruitList.add(pear);
//        Fruit grape = new Fruit("Grape", R.mipmap.ic_launcher);
//        fruitList.add(grape);
//        Fruit pineapple = new Fruit("Pineapple", R.mipmap.ic_launcher);
//        fruitList.add(pineapple);
//        Fruit strawberry = new Fruit("Strawberry", R.mipmap.ic_launcher);
//        fruitList.add(strawberry);
//        Fruit cherry = new Fruit("Cherry", R.mipmap.ic_launcher);
//        fruitList.add(cherry);
//        Fruit mango = new Fruit("Mango", R.mipmap.ic_launcher);
//        fruitList.add(mango);
//        Fruit grape1 = new Fruit("Grape", R.mipmap.ic_launcher);
//        fruitList.add(grape1);
//        Fruit pineapple1 = new Fruit("Pineapple", R.mipmap.ic_launcher);
//        fruitList.add(pineapple1);
//        Fruit strawberry1 = new Fruit("Strawberry", R.mipmap.ic_launcher);
//        fruitList.add(strawberry1);
//        Fruit cherry1 = new Fruit("Cherry", R.mipmap.ic_launcher);
//        fruitList.add(cherry1);
//        Fruit mango1 = new Fruit("Mango", R.mipmap.ic_launcher);
//        fruitList.add(mango1);
//    }
}
