//某本童话书章节列表
package com.example.applicationcombine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class jianjiaomao extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jianjiaomao);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new bClick());
    }
    class bClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(jianjiaomao.this,list.class);
            startActivity(intent);
        }

    }
}