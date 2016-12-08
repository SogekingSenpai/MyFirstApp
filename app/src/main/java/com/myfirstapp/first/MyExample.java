package com.myfirstapp.first;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Cipher on 12/7/2016.
 */

public class MyExample extends AppCompatActivity{
    public void doSomethingNew() {
        Toast.makeText(getApplicationContext(), "We're doin Something", Toast.LENGTH_SHORT).show();
    }
}
