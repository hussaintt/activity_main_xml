package com.example.hussain.bass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int Score=0;
    int ScoreB=0;

    public void addThreePointsB(View view){

        ScoreB=ScoreB+3;

        displayForTeamB(ScoreB);
    }

    public void addOnePointB(View view){

        ScoreB=ScoreB+1;

        displayForTeamB(ScoreB);
    }


    public void addTwoPointsB(View view){

        ScoreB=ScoreB+2;

        displayForTeamB(ScoreB);

    }
    public void addThreePoints(View view){

   Score=Score+3;

   displayForTeamA(Score);
    }

    public void addOnePoint(View view){

        Score=Score+1;

        displayForTeamA(Score);
    }
    public void addTwoPoints(View view){

        Score=Score+2;

        displayForTeamA(Score);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));

    }
    public void reset(View view){
        Score =0;
        ScoreB=0;
        displayForTeamA(Score);
        displayForTeamB(Score);

    }


}

