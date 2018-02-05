package com.example.andro.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


import static com.example.andro.quizapp.R.id.write_answer;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Logic for button OnClick
        Button btnSubmit = findViewById(R.id.submit_answer);
        btnSubmit.setOnClickListener(new View.OnClickListener() {

            //One point is added when answer below is clicked
            @Override
            public void onClick(View view) {
                //Initial score value
                int score = 0;
                //Good answer for question 1
                if (((RadioButton) findViewById(R.id.radio_button)).isChecked()) {
                    score += 1;
                }
                //Good answer for question 2
                if (((CheckBox) findViewById(R.id.check_box1)).isChecked()) {
                    score += 1;
                }
                if (((CheckBox) findViewById(R.id.check_box4)).isChecked()) {
                    score += 1;
                }
                //Good answer for question 3
                if (((CheckBox) findViewById(R.id.check_box6)).isChecked()) {
                    score += 1;
                }
                //Good answer for question 4
                if (((RadioButton) findViewById(R.id.radio_button3)).isChecked()) {
                    score += 1;
                }
                //Good answer for question 5
                EditText inputTxt = findViewById(write_answer);
                String name;
                name = inputTxt.getText().toString();
                if (name.equals("1")) {
                    score += 1;
                }
                //Display score in Toast message
                displayResult(score);
            }

        });
    }
    //defining what is to be shown in Toast message
    private void displayResult(int score) {
        String message = "You scored " + score;
        message += " of 6";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}










