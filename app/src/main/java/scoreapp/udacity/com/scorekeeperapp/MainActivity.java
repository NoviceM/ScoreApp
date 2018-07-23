package scoreapp.udacity.com.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resetScore();
            }
        });

        Button sixRunsforTeamA    = (Button) findViewById(R.id.sixRunsforTeamA);
        sixRunsforTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamA(6);
            }
        });
        Button fourRunsforTeamA   = (Button) findViewById(R.id.fourRunsforTeamA);
        fourRunsforTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamA(4);
            }
        });
        Button singleRunforTeamA  = (Button) findViewById(R.id.singleRunforTeamA);
        singleRunforTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamA(1);
            }
        });

        Button sixRunsforTeamB    = (Button) findViewById(R.id.sixRunsforTeamB);
        sixRunsforTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamB(6);
            }
        });
        Button fourRunsforTeamB   = (Button) findViewById(R.id.fourRunsforTeamB);
        fourRunsforTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamB(4);
            }
        });
        Button singleRunforTeamB  = (Button) findViewById(R.id.singleRunforTeamB);
        singleRunforTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseScoreforTeamB(1);
            }
        });
    }


    public void increaseScoreforTeamA(int score){
        teamAScore += score;
        displayScoreforTeamA(teamAScore);
    }

    public void increaseScoreforTeamB(int score){
        teamBScore += score;
        displayScoreforTeamB(teamBScore);
    }

    public void resetScore(){
       teamAScore = 0;
       displayScoreforTeamA(teamAScore);
       teamBScore = 0;
       displayScoreforTeamB(teamBScore);
    }

    public void displayScoreforTeamA(int Score){
        TextView scoreOfTeamA = (TextView) findViewById( R.id.scoreTeamA);
        scoreOfTeamA.setText(String.valueOf(teamAScore));
    }

    public void displayScoreforTeamB(int Score){
        TextView scoreOfTeamB = (TextView) findViewById( R.id.scoreTeamB);
        scoreOfTeamB.setText(String.valueOf(teamBScore));
    }


}
