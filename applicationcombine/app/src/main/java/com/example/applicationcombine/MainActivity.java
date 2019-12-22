//主页
package com.example.applicationcombine;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn1= (Button) findViewById(R.id.button);
        final Button btn2 = (Button) findViewById(R.id.button2);
        final Button btn3 = (Button) findViewById(R.id.button3);
        final Button btn4 = (Button) findViewById(R.id.button4);
        final Button btn5 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,bookrack.class);
                startActivity(intent);

            }

        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }

        });
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,settings.class);
                startActivity(intent);

            }

        });

    }
}
