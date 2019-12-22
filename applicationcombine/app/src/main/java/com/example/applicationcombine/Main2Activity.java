//童话书城
package com.example.applicationcombine;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final Button btn6 = (Button) findViewById(R.id.button6);
        final Button btn7 = (Button) findViewById(R.id.button8);
        final Button btn9 = (Button) findViewById(R.id.button14);
        final Button btn11 = (Button) findViewById(R.id.button16);

        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent2 =new Intent(Main2Activity.this,Main3Activity.class);
                   startActivity(intent2);
              //  finish();

            }

        });
        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent4 =new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent4);
                //  finish();

            }

        });
        btn11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent6 =new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intent6);
                //  finish();

            }

        });
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Main2Activity.this,MainActivity.class);
             //   startActivity(intent2);
                finish();

            }

        });
    }
}
