package com.example.trinketdnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.mainText);
        Player pc = new Player();
        String strengthPolarity = "";
        String dexterityPolarity = "";
        String constitutionPolarity = "";
        String intelligencePolarity = "";
        String wisdomPolarity = "";
        String charismaPolarity = "";
        if (pc.strength / 2 - 5 > 0) {
            strengthPolarity = "+";
        } else if (pc.strength / 2 - 5 < 0) {
            strengthPolarity = "-";
        }
        if (pc.dexterity / 2 - 5 > 0) {
            dexterityPolarity = "+";
        } else if (pc.dexterity / 2 - 5 < 0) {
            dexterityPolarity = "-";
        }
        if (pc.constitution / 2 - 5 > 0) {
            constitutionPolarity = "+";
        } else if (pc.constitution / 2 - 5 < 0) {
            constitutionPolarity = "-";
        }
        if (pc.intelligence / 2 - 5 > 0) {
            intelligencePolarity = "+";
        } else if (pc.intelligence / 2 - 5 < 0) {
            intelligencePolarity = "-";
        }
        if (pc.wisdom / 2 - 5 > 0) {
            wisdomPolarity = "+";
        } else if (pc.wisdom / 2 - 5 < 0) {
            wisdomPolarity = "-";
        }
        if (pc.charisma / 2 - 5 > 0) {
            charismaPolarity = "+";
        } else if (pc.charisma / 2 - 5 < 0) {
            charismaPolarity = "-";
        }
        textView = (TextView) findViewById(R.id.mainText);
        textView.setText("Strength: " + pc.strength + " (" + strengthPolarity + (pc.strength / 2 - 5) + ")" + "\n" + "Dexterity: " + pc.dexterity + " (" + dexterityPolarity + (pc.dexterity / 2 - 5) + ")" + "\n" + "Constitution: " + pc.constitution + " (" + constitutionPolarity + (pc.constitution / 2 - 5) + ")" + "\n" + "Intelligence: " +  pc.intelligence + " (" + intelligencePolarity + (pc.intelligence / 2 - 5) + ")" + "\n" + "Wisdom: " + pc.wisdom + " (" + wisdomPolarity + (pc.wisdom / 2 - 5) + ")" + "\n" + "Charisma: " + pc.charisma + " (" + charismaPolarity + (pc.charisma / 2 - 5) + ")");
        textView = (TextView) findViewById(R.id.raceText);
        textView.setText(pc.raceName);

        Button refreshButton = (Button)this.findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUpButton();
            }
        });
    }

    private void setUpButton() {
        Player pc = new Player();
        TextView textView = (TextView) findViewById(R.id.mainText);
        String strengthPolarity = "";
        String dexterityPolarity = "";
        String constitutionPolarity = "";
        String intelligencePolarity = "";
        String wisdomPolarity = "";
        String charismaPolarity = "";
        if (pc.strength / 2 - 5 > 0) {
            strengthPolarity = "+";
        } else if (pc.strength / 2 - 5 < 0) {
            strengthPolarity = "-";
        }
        if (pc.dexterity / 2 - 5 > 0) {
            dexterityPolarity = "+";
        } else if (pc.dexterity / 2 - 5 < 0) {
           dexterityPolarity = "-";
        }
        if (pc.constitution / 2 - 5 > 0) {
            constitutionPolarity = "+";
        } else if (pc.constitution / 2 - 5 < 0) {
            constitutionPolarity = "-";
        }
        if (pc.intelligence / 2 - 5 > 0) {
            intelligencePolarity = "+";
        } else if (pc.intelligence / 2 - 5 < 0) {
            intelligencePolarity = "-";
        }
        if (pc.wisdom / 2 - 5 > 0) {
            wisdomPolarity = "+";
        } else if (pc.wisdom / 2 - 5 < 0) {
            wisdomPolarity = "-";
        }
        if (pc.charisma / 2 - 5 > 0) {
            charismaPolarity = "+";
        } else if (pc.charisma / 2 - 5 < 0) {
            charismaPolarity = "-";
        }


        textView.setText("Strength: " + pc.strength + " (" + strengthPolarity + (pc.strength / 2 - 5) + ")" + "\n" + "Dexterity: " + pc.dexterity + " (" + dexterityPolarity + (pc.dexterity / 2 - 5) + ")" + "\n" + "Constitution: " + pc.constitution + " (" + constitutionPolarity + (pc.constitution / 2 - 5) + ")" + "\n" + "Intelligence: " +  pc.intelligence + " (" + intelligencePolarity + (pc.intelligence / 2 - 5) + ")" + "\n" + "Wisdom: " + pc.wisdom + " (" + wisdomPolarity + (pc.wisdom / 2 - 5) + ")" + "\n" + "Charisma: " + pc.charisma + " (" + charismaPolarity + (pc.charisma / 2 - 5) + ")");
        textView = (TextView) findViewById(R.id.raceText);
        textView.setText(pc.raceName);
    }
}