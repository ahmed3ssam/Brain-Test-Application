package easy.tuto.myquizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity  {

    Button scince;
    Button math;
    Button geography;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        scince = (Button) findViewById(R.id.submit_btn);
        math = (Button) findViewById(R.id.submit_btn2);
        geography = (Button) findViewById(R.id.submit_btn3);
        back = (Button) findViewById(R.id.submit_btn4);

        scince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(),QSActivity.class);
                startActivity(in2);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(),MathActivity.class);
                startActivity(in2);
            }
        });
        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(),GeographyActivity.class);
                startActivity(in2);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in2);
            }
        });

    }





}

