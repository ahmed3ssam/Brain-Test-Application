package easy.tuto.myquizapplication;

import android.app.UiModeManager;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    boolean flag = false;
    private UiModeManager uiModeManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startbutton=(Button)findViewById(R.id.submit_btn);
        Button aboutbutton=(Button)findViewById(R.id.submit_btn2);
        Switch sw=(Switch)findViewById(R.id.switch1);
        Switch main_dark=(Switch)findViewById(R.id.switch_main_dark);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),CategoriesActivity.class);
                startActivity(intent);
            }
        });
        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent);
            }
        });
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                            setContentView(R.layout.activity_main_dark);
                            Intent intent=new Intent(getApplicationContext(),MainDarkActivity.class);
                            startActivity(intent);
                        startbutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent intent=new Intent(getApplicationContext(),CatgoriesActivityDark.class);
                                startActivity(intent);
                            }
                        });
                        aboutbutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent intent=new Intent(getApplicationContext(),AboutDarkActivity.class);
                                startActivity(intent);
                            }
                        });
                    }



            }
        });

    }
}
