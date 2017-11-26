package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.Score;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.BuzzFeedAdapter;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.MyListener;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.DataModel;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.mygame.PokemonGame;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.supportscreen.Result;

public class MainActivity extends AppCompatActivity implements MyListener {
    private List<DataModel> gameList = new ArrayList<>();
    private Random random = new Random();
    private int score = 0;
    private ArrayList<String> userAnswer = new ArrayList<>();
    Intent intent;
    TextView resultAlertText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_View);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        for (int i = 0; i < PokemonGame.pokemoneName.length; i++) {
            userAnswer.clear();
            userAnswer.add("");
        }

        for (int i = 0; i < PokemonGame.pokemoneName.length; i++) {
            game(i);

        }


        BuzzFeedAdapter buzzFeedAdapter = new BuzzFeedAdapter(gameList);
        buzzFeedAdapter.setListener(this);
        recyclerView.setAdapter(buzzFeedAdapter);

    }

    String TAG = "tag";

    private void game(int i) {


        int x1 = getRandom();
        int x2 = getRandom();
        int x3 = getRandom();
        int x4 = getRandom();
        if (x1 != x2 && x1 != x3 && x1 != x4 && (x1 == i || x2 == i || x3 == i || x4 == i)) {
            gameList.add(new DataModel("Guess What's the name of This Pokemon?",
                    PokemonGame.pokemoneName[x1],
                    PokemonGame.pokemoneName[x2],
                    PokemonGame.pokemoneName[x3],
                    PokemonGame.pokemoneName[x4],
                    PokemonGame.pokemonePic[i],
                    i));

        } else {

            game(i);
        }


    }


    private int getRandom() {
        return random.nextInt(PokemonGame.pokemoneName.length);
    }


    @Override
    public void onOptionClicked(String userClick, int indexOfAnswer) {
        //do the compare ....
        userAnswer.add(userClick);
        intent = new Intent(this, Result.class);
        if (userClick.equals(PokemonGame.pokemoneName[indexOfAnswer])) {
            score++;

        }
        if (userAnswer.size() == PokemonGame.pokemoneName.length) {

            //TODO you need create alert dialoge.
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);//we passing our activtiy
            LayoutInflater inflater = MainActivity.this.getLayoutInflater();
            builder.setMessage("You are: ");
            builder.setView(inflater.inflate(R.layout.my_alert_dialog, null, false))
            .setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rg6CiPI6h2g"));
                    startActivity(intent);
                }
            });

            AlertDialog dialog = builder.create();
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();

            //TODO convert your score and show it to the textView.
            resultAlertText = dialog.findViewById(R.id.result_alert);
            String scoreValue = Score.scoreConverter(score);
            resultAlertText.setText(scoreValue);


        }


    }


}
