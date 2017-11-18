package nyc.muaadh_melhi_develpoer.my_buzzfeed_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.BuzzFeedAdapter;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.MyListener;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.DataModel;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.mygame.PokemonGame;

public class MainActivity extends AppCompatActivity implements MyListener {
    private List<DataModel> gameList = new ArrayList<>();
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_View);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        for (int i = 0; i < PokemonGame.pokemoneName.length; i++) {
            game(i);

        }



        BuzzFeedAdapter buzzFeedAdapter = new BuzzFeedAdapter(gameList);
        buzzFeedAdapter.setListener(this);
        recyclerView.setAdapter(buzzFeedAdapter);

        //buzzFeedAdapter.getGameList().clear();
        //buzzFeedAdapter.setGameList(gameList);
        //buzzFeedAdapter.notifyDataSetChanged();
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
                    PokemonGame.pokemonePic[i]


            ));

        } else {
            Log.d(TAG, "game:value of  " + i);
            game(i);
        }


    }


    private int getRandom() {
        return random.nextInt(PokemonGame.pokemoneName.length);
    }

    @Override
    public void doStuff(String answer) {
        // getting answer
    }
}
