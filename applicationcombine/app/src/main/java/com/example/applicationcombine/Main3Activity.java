//新书频道
package com.example.applicationcombine;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button btn8 = (Button) findViewById(R.id.button13);
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent3 =new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent3);
                //  finish();

            }

        });
    }
}
