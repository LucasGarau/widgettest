package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.*;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import static com.example.lesson7.R.raw.cat_sound;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changedate(View v) {
        Button btn = findViewById(R.id.button);
        Date currentTime = Calendar.getInstance().getTime();
        String dateFacDB = DateFormat.format("yyyy.MM.dd.hh.mm.ss", currentTime).toString();
        btn.setBackgroundColor(GREEN);
        btn.setText( dateFacDB);
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        if (checked) {
            ((CheckBox)findViewById (R.id.checkBox)).setText ("Checkbox is checked");
        }

            else {
            ((CheckBox)findViewById (R.id.checkBox)).setText ("Checkbox is not checked");
        }



        }


    public void red(View v){
        TextView vtn = findViewById(R.id.textView4);
        vtn.setBackgroundColor(RED);
     }

    public void blue(View v){
        TextView vtn = findViewById(R.id.textView4);
        vtn.setBackgroundColor(BLUE);
    }

    public void verde(View v){
        TextView vtn = findViewById(R.id.textView4);
        vtn.setBackgroundColor(GREEN);
    }
//    public void cambiarActividad(View view)
//    {
//        Intent intent = new Intent(MainActivity.this, .class);
//        startActivity(intent);
//    }

    public void copiar(View v){
        final MediaPlayer sonido = MediaPlayer.create(this, cat_sound);
        sonido.start();
        TextView lol = findViewById(R.id.textView2);
        String t = (String) lol.getText();
        EditText edit = findViewById(R.id.editText);
        edit.setText(t);



    }
}