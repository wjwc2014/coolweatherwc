package com.example.wcc.fragmenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button:
//                AnotherRightFragment fragment = new AnotherRightFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction transaction = fragmentManager.
//                        beginTransaction();
//                transaction.replace(R.id.right_layout, fragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
//                break;
//            default:
//                break;
//        } }
}
