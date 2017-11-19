package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.supportscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imageView=findViewById(R.id.result_image);
        Picasso.with(getApplicationContext()).load("https://cdn1.recombu.com/media/mobile/Features/PokemonGOTypes/PokemonTypesHero2_w720.jpg").into(imageView);

    }
}
