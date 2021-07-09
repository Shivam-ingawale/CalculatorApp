package com.shivamingawale.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button add,mult,sub,div;
    TextView text;
    EditText n1,n2;
    float x=0,y=0,z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.x);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        text = findViewById(R.id.text);


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(n1.getText().toString());
                y = Float.valueOf(n2.getText().toString());
                text.setVisibility(view.VISIBLE);
                z=x/y;
                String a = String.format(Locale.getDefault(),"%.02f / %.02f = %.02f",x,y,z);
                text.setText(a);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(n1.getText().toString());
                y = Float.valueOf(n2.getText().toString());
                text.setVisibility(view.VISIBLE);
                z=x-y;
                String a = String.format(Locale.getDefault(),"%.02f - %.02f = %.02f",x,y,z);
                text.setText(a);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(n1.getText().toString());
                y = Float.valueOf(n2.getText().toString());
                text.setVisibility(view.VISIBLE);
                z=x+y;
                String a = String.format(Locale.getDefault(),"%.02f + %.02f = %.02f",x,y,z);
                text.setText(a);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.valueOf(n1.getText().toString());
                y = Float.valueOf(n2.getText().toString());

                z=x*y;
                text.setVisibility(view.VISIBLE);
                String a = String.format(Locale.getDefault(),"%.02f * %.02f = %.02f",x,y,z);
                text.setText(a);
            }
        });





    }
}