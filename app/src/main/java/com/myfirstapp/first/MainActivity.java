package com.myfirstapp.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.LoginFilter;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public int inits = 22;
    public int[] nothing = {22, 22};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MyExample mE = new MyExample();

        //mE.doSomethingNew();
        for (int i = 0; i < 3; i++) {
            Log.i(TAG, "onCreate i = " + i);
        }
        SomethingdoDo();
    }

    private void SomethingdoDo() {
        String nothing = "Something";
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void dataProgramme(){
        //String nohting = "Something";

    }
}
