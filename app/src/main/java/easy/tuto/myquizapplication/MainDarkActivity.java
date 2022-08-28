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

public class MainDarkActivity extends AppCompatActivity {
    boolean flag = false;
    private UiModeManager uiModeManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dark);
        uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);
        Button startbutton=(Button)findViewById(R.id.submit_btn);
        Button aboutbutton=(Button)findViewById(R.id.submit_btn2);
        Switch main_dark=(Switch)findViewById(R.id.switch_main_dark);

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
        main_dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                        setContentView(R.layout.activity_main);
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
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
                }

            }
        });

    }
}
