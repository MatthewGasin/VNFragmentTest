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
        lines.add("Or is it just fantasy?");
        lines.add("caught in a landslide");
        lines.add("no escape from reality");
        lines.add("open your eyes");
        lines.add("look up to skies and see");
        lines.add("I'm just a poor boy, I need no sympathy");
        lines.add("because I'm easy come, easy go");
        lines.add("a little high, little low");
        lines.add("Anyway the wind blows, doesn't really matter to me, to me");
        lines.add("*interlude*");
        lines.add("Mama, just killed a man");
        lines.add("put a gun against his head");
        lines.add("pulled my trigger, now he's dead");
        lines.add("Mama, life had just begun");
        lines.add("but now I've gone and thrown it all away");
        lines.add("maamaaaaaa oooooo");
        lines.add("didn't mean to make you cry");
        lines.add("if I'm not back again this time tomorrow");
        lines.add("carry on, carry on, as if nothing really matters");
        lines.add("*interlude*");
        lines.add("too late, my time has come");
        lines.add("sends shivers down my spine");
        lines.add("dody's aching all the time");
        lines.add("goodbye everybody I've got to go");
        lines.add("gotta leave you all behind and face the truth");
        lines.add("maamaaaaaa oooooo (anyway the wind blows)");
        lines.add("I don't want to die");
        lines.add("I sometimes wish I'd never been born at all");
        lines.add("*interlude*");
        lines.add("I see a little silhouetto of a man");
        lines.add("scaramouch, scaramouch will you do the fandango");
        lines.add("thunderbolt and lightning very very frightening me");
        lines.add("Gallileo, Gallileo, Gallileo, Gallileo, Gallileo, Figaro- Magnifico!");
        lines.add("but I'm just a poor boy and nobody loves me");
        lines.add("he's just a poor boy from a poor family");
        lines.add("spare him his life from this monstrosity");
        lines.add("bismillah! No we will not let you go - let him go!");
        lines.add("bismillah! We will not let you go - let him go!");
        lines.add("bismillah! We will not let you go let me go!");
        lines.add("will not let you go let me go");
        lines.add("never let you go let me go");
        lines.add("never let me go ooo");
        lines.add("No, no, no, no, no, no, no");
        lines.add("Oh mama mia, mama mia, mama mia let me go");
        lines.add("Beelzebub has a devil put aside for me, for mee, for meeeee!");
        lines.add("*rocky interlude*");
        lines.add("so you think you can stop me and spit in my eye?");
        lines.add("so you think you can love me and leave me to die!");
        lines.add("oh baby can't do this to me baby");
        lines.add("Just gotta get out just gotta get right outta here!");
        lines.add("*interlude*");
        lines.add("oooh yeah, ooh yeah");
        lines.add("nothing really matters");
        lines.add("anyone can see");
        lines.add("nothing really matters nothing really matters to me");
        lines.add("...anyway the wind blows...");
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
