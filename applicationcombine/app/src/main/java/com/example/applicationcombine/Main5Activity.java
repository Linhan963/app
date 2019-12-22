//小编推荐
package com.example.applicationcombine;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final Button btn12 = (Button) findViewById(R.id.button17);
        btn12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent7 =new Intent(Main5Activity.this,Main2Activity.class);
                startActivity(intent7);
                //  finish();

            }

        });
    }
}
