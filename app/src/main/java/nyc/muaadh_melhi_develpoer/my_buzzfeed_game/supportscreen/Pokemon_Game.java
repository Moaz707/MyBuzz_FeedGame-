package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.supportscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.activity.MainActivity;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.activity.ZombieActivity;

public class Pokemon_Game extends AppCompatActivity implements View.OnClickListener{
    Button pokemon,zombie;
    ImageView gameImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon__game);
        pokemon=(Button) findViewById(R.id.play_pokemon);
        zombie=(Button) findViewById(R.id.play_zombie);
        gameImage=(ImageView) findViewById(R.id.image_game);
        pokemon.setOnClickListener(this);
        zombie.setOnClickListener(this);

        Picasso.with(this).load(R.drawable.quiz).into(gameImage);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==pokemon.getId()){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if (v.getId()==zombie.getId()){
            Intent intent=new Intent(this,ZombieActivity.class);
            startActivity(intent);
        }

    }
}
