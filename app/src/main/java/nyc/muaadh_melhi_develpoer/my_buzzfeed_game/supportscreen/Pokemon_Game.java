package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.supportscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.MainActivity;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.mygame.PokemonGame;

public class Pokemon_Game extends AppCompatActivity implements View.OnClickListener{
    Button begin;
    ImageView pokemonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon__game);
        begin=(Button) findViewById(R.id.play_pokemon);
        pokemonImage=(ImageView) findViewById(R.id.image_pokemon);
        begin.setOnClickListener(this);

        Picasso.with(this).load(R.drawable.pokemon_challenge).into(pokemonImage);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
