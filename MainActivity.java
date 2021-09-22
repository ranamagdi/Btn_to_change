 package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

 public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button text=findViewById(R.id.btntext);
        text.setOnClickListener(this::onClick);

        Button imageb=findViewById(R.id.btnimage);
        imageb.setOnClickListener(this::onClick);






    }

     @Override
     public void onClick(View view) {
         ImageView image=findViewById(R.id.image);
         TextView change =findViewById(R.id.text);
        if(view.getId()==R.id.btntext)
          change.setText("Hello");
        else if(view.getId()==R.id.btnimage)
           image.setImageResource(R.drawable.po);
     }
 }