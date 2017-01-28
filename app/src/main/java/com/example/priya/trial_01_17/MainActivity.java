package com.example.priya.trial_01_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView totalTxtView;
    EditText percentTxt;
    EditText numTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTxtView = (TextView) findViewById(R.id.totalTextView);
        percentTxt = (EditText) findViewById(R.id.percentTxt);
        numTxt = (EditText) findViewById(R.id.numTxt);
        Button calcBttn = (Button)findViewById(R.id.calcBttn);
        calcBttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(percentTxt.getText().toString());
                float decimal = percentage/100;
                float result = decimal* Float.parseFloat(numTxt.getText().toString());
                totalTxtView.setText(Float.toString(result));

            }
        });
    }
}
