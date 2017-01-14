package com.example.wcc.databasetest;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private MyDatabaseHelper dbHelper;
    private Button sendNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dbHelper = new MyDatabaseHelper(this, "BookStore.db", null, 2);
//        Button createDatabase = (Button) findViewById(R.id.create_database);
//        createDatabase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dbHelper.getWritableDatabase();
//            }
//        });
//
//        Button addData = (Button) findViewById(R.id.add_data);
//        addData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SQLiteDatabase db = dbHelper.getWritableDatabase();
//                ContentValues values = new ContentValues();
//// 开始组装第一条数据
//                values.put("name", "The Da Vinci Code");
//                values.put("author", "Dan Brown");
//                values.put("pages", 454);
//                values.put("price", 16.96);
//                db.insert("Book", null, values);
//                // 插入第一条数据
//                values.clear();
//// 开始组装第二条数据
//                values.put("name", "The Lost Symbol");
//                values.put("author", "Dan Brown");
//                values.put("pages", 510);
//                values.put("price", 19.95);
//                db.insert("Book", null, values);
//                // 插入第二条数据
//            } });

        sendNotice = (Button) findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_notice:
                NotificationManager manager = (NotificationManager)
                        getSystemService(NOTIFICATION_SERVICE);
                Notification.Builder builder = new Notification.Builder(MainActivity.this);
                builder.setContentTitle("Bmob Test");
                builder.setContentText("nnnnnnnnnnnnnnccccccccc");
                builder.setSmallIcon(R.mipmap.ic_launcher);
                Notification notification = builder.build();
                manager.notify(R.mipmap.ic_launcher, notification);
                break;
            default:
                break;
        }
    }

}
