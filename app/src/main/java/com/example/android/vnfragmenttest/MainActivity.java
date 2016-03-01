package com.example.android.vnfragmenttest;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView dialogue;
    TextView name;
    ArrayList<String> lines;
    boolean onFirstName;
    int c;
    String a;
    String b;
    ImageView holden;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = -1;
        onFirstName = true;
        a = "Holden";
        b = "Tara";

        dialogue = (TextView) findViewById(R.id.dialogueText);
        name = (TextView) findViewById(R.id.nameText);
        holden = (ImageView) findViewById(R.id.holdenImage);
        avatar = (ImageView) findViewById(R.id.avatarImage);

        lines = new ArrayList<String>();
        lines.add("You can burn my clothes up when I'm gone");
        lines.add("You can tell your friends just what a fool I've been");
        lines.add("And laugh and joke about me on the phone");
        lines.add("You can tell my arms go back to the farm");
        lines.add("You can tell my feet to hit the floor");
        lines.add("Or you can tell my lips to tell my fingertips");
        lines.add("They won't be reaching out for you no more");
        lines.add("But don't tell my heart");
        lines.add("My achy breaky heart");
        lines.add("I just don't think he'd understand");
        lines.add("And if you tell my heart");
        lines.add("My achy breaky heart");
        lines.add("He might blow up and kill this man");
        lines.add("You can tell your mom I moved to Arkansas");
        lines.add("You can tell your dog to bite my leg");
        lines.add("Or tell your brother Cliff whose fist can tell my lip");
        lines.add("He never really liked me anyway");
        lines.add("Or tell your Aunt Louise, tell anything you please");
        lines.add("Myself already knows I'm not OK.");
        lines.add("Or you can tell my eyes to watch out for my mind");
        lines.add("It might be walking out on me today");
        lines.add("But don't tell my heart");
        lines.add("My achy breaky heart");
        lines.add("I just don't think he'd understand");
        lines.add("And if you tell my heart");
        lines.add("My achy breaky heart");
        lines.add("He might blow up and kill this man");
        lines.add("But don't tell my heart");
        lines.add("My achy breaky heart");
        lines.add("I just don't think he'd understand");
        lines.add("And if you tell my heart");
        lines.add("My achy breaky heart");
        lines.add("He might blow up and kill this man");
        lines.add("But don't tell my heart");
        lines.add("My achy breaky heart");
        lines.add("I just don't think he'd understand");
        lines.add("And if you tell my heart");
        lines.add("My achy breaky heart");
        lines.add("He might blow up and kill this man");
        lines.add("will not let you go let me go");
        lines.add("end");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View view){
        c++;

        dialogue.setText("     " + lines.get(c));
        if(c == lines.size()-1){
            Intent intent = new Intent(this, EndActivity.class);
            startActivity(intent);
        }
        if(onFirstName){
            //tara
            name.setText(b);
            avatar.setScaleX(1.2f);
            avatar.setScaleY( 1.2f);
            holden.setScaleX(1f);
            holden.setScaleY(1f);
        } else {
            //holden
            name.setText(a);
            avatar.setScaleX(1f);
            avatar.setScaleY(1f);
            holden.setScaleX(1.2f);
            holden.setScaleY(1.2f);
        }
        onFirstName = !onFirstName;

    }


}
