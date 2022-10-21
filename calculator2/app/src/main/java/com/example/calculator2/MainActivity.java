package com.example.calculator2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView calculator= findViewById(R.id.calculator);
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        Button calculate = findViewById(R.id.calculate);
        TextView total = findViewById(R.id.total);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = number1.getText().toString();
                String b = number2.getText().toString();
                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);
                int z = x + y;
                total.setText(z + "");


            }


    });



    }
}