//童话书详情页
package com.example.applicationcombine;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final Button btn10 = (Button) findViewById(R.id.button15);
        btn10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent5 =new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(intent5);
                //  finish();

            }

        });
    }
}
