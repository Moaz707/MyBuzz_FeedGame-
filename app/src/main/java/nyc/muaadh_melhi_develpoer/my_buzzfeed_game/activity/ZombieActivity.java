package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.activity;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.Score;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.ScoreKeeper;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.ZombieScore;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.ZombieAdapter;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.ZombieDataModel;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.mygame.Info;

public class ZombieActivity extends AppCompatActivity {

    private List<ZombieDataModel> infoGame = new ArrayList<>();
    private TextView resultAlertText;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycle_View);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        ScoreKeeper.userChoiceList.clear();

        for (int i = 0; i < Info.quiz.length; i++) {
            infoGame.add(new ZombieDataModel(Info.images[i], Info.quiz[i], Info.choice1[i], Info.choice2[i]));
        }

        ZombieAdapter myadapter = new ZombieAdapter(infoGame);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myadapter);

        score = ScoreKeeper.getScore();
        Log.d("game before", "true");


    }

    public void myGame() {

        Log.d("accesse 111", "true");
        if (ScoreKeeper.userChoiceList.size() == Info.quiz.length) {
            Log.d("accesse", "true");
            //TODO you need create alert dialoge.
            AlertDialog.Builder builder = new AlertDialog.Builder(ZombieActivity.this);//we passing our activtiy
            LayoutInflater inflater = ZombieActivity.this.getLayoutInflater();
            builder.setMessage("You ");
            builder.setView(inflater.inflate(R.layout.my_alert_dialog, null, false))
                    .setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog dialog = builder.create();
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();

            //TODO convert your score and show it to the textView.
            resultAlertText = dialog.findViewById(R.id.result_alert);
            String scoreValue = ZombieScore.scoreConverter(score);
            resultAlertText.setText(scoreValue);

        }
    }

}
