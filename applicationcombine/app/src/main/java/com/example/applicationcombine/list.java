//书架垂直滑动、按书籍名称分模块布局
package com.example.applicationcombine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class list extends AppCompatActivity {
    ImageButton change;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        change=(ImageButton)findViewById(R.id.change1);
        change.setOnClickListener(new changeClick());
        textView=(TextView)findViewById(R.id.textView5);
        textView.setOnClickListener(new tClick());
        button=(Button)findViewById(R.id.button18);
        button.setOnClickListener(new backClick());
    }
    class changeClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(list.this,bookrack.class);
            startActivity(intent);
        }

    }
    class tClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(list.this,jianjiaomao.class);
            startActivity(intent);
        }

    }
    class backClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(list.this,MainActivity.class);
            startActivity(intent);
        }

    }
}
