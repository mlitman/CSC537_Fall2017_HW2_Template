package com.example.awesomefat.csc537_fall2017_hw2_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText hugeInt1ET;
    private EditText hugeInt2ET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.hugeInt1ET = (EditText)this.findViewById(R.id.hugeInt1ET);
        this.hugeInt2ET = (EditText)this.findViewById(R.id.hugeInt2ET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    //MVC: this is how we expose a method to be used in onClick events in interface builder
    public void onAddButtonPressed(View v)
    {
        HugeInteger hugeInt1 = new HugeInteger(this.hugeInt1ET.getText().toString());
        HugeInteger hugeInt2 = new HugeInteger(this.hugeInt2ET.getText().toString());
        HugeInteger answer = hugeInt1.add(hugeInt2);
        this.answerTV.setText(answer.toString());
    }


}
