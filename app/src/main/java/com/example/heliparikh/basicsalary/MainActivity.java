package com.example.heliparikh.basicsalary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText et1;
    Button btnCalculate;
    TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1 = (EditText)findViewById(R.id.editText2);
        btnCalculate = (Button)findViewById(R.id.button5);
        tv1 = (TextView)findViewById(R.id.textView3);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


            //return (sal + (sal * 40 / 100) + (sal * 10 / 100));
       String str1 =  et1.getText().toString();
       int num = Integer.parseInt(str1);

        num = num + (num * 40 /100) + (num * 10 /100);

        String ans = String.valueOf(num);

        tv1.setText(ans);

        Toast.makeText(this,"Total Salary ::"+ans,Toast.LENGTH_SHORT).show();
    }
}
