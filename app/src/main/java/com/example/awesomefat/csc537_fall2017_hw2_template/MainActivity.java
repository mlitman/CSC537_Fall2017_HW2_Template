package com.example.awesomefat.csc537_fall2017_hw2_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();
        ll.addFront(3);
        ll.addFront(4);
        ll.addEnd(2);
        ll.display();
        System.out.println(ll.removeEnd());
        ll.display();
    }
}
