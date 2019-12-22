//书架
package com.example.applicationcombine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class bookrack extends AppCompatActivity {

    Button button;
    SeekBar size;
    TextView sizeview;
    HorizontalScrollView horizontalScrollView;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookrack_activity_layout);
        size=(SeekBar)findViewById(R.id.size);
        size.setOnSeekBarChangeListener(new sSeekBar());
        sizeview=(TextView)findViewById(R.id.sizeview);
        horizontalScrollView=(HorizontalScrollView)findViewById(R.id.horizontalscrollview);
        imageButton=(ImageButton)findViewById(R.id.change2);
        imageButton.setOnClickListener(new onClick());
        button=(Button)findViewById(R.id.button19);
        button.setOnClickListener(new backClick());
    }
    class sSeekBar implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            sizeview.setText(Integer.toString(progress)+"%");
            horizontalScrollView.setScrollX(3000*progress/100);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
    class onClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(bookrack.this,list.class);
            startActivity(intent);
        }
    }
    class backClick implements View.OnClickListener {
        public void onClick(View v)
        {
            Intent intent=new Intent(bookrack.this,MainActivity.class);
            startActivity(intent);
        }
    }

}
