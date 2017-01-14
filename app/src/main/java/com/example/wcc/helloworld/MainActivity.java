package com.example.wcc.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private EditText editText;
    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


//        Log.d("MainActivity", getClass().getSimpleName());
//
//        if (savedInstanceState != null) {
//            String tempData = savedInstanceState.getString("data_key");
//            Log.d("Main", tempData);
//        }

        button = (Button) findViewById(R.id.button11);
        editText = (EditText) findViewById(R.id.edittext11);
        imageView  = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);

//        Button button1 = (Button)findViewById(R.id.button_1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "you clicked button1", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                startActivity(intent);
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);

//                String data = "Hello SecondActivity";
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
//                startActivityForResult(intent, 1);



            }


//        });
//
//
//        Button startNormalActivity = (Button) findViewById(R.id.startnormalactivity);
//        Button startDialogActivity = (Button) findViewById(R.id.startdialogactivity);
//
//        startNormalActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {




//                Intent intent = new Intent(MainActivity.this,
//                        SecondActivity.class);
//                startActivity(intent);
//            } });
//
//        startDialogActivity.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,
//                        ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button11:

                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);

//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText,
//                        Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.mipmap.newpic);

//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }

                AlertDialog.Builder dialog = new AlertDialog.Builder
                        (MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.
                        OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.
                        OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();

                break;
            default:
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key", tempData);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("MainActivity", returnedData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
                return true;
        }

        return super.onMenuItemSelected(item.getItemId(),item);
    }
}
