package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.supportscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;

public class Result extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imageView=findViewById(R.id.result_image);
        TextView textView=findViewById(R.id.text_comment);

        Intent intent=getIntent();
       String str= intent.getExtras().getString("score");
       textView.setText("Great !!! your score is:"+str);

       Picasso.with(getApplicationContext()).load("https://cdn1.recombu.com/media/mobile/Features/PokemonGOTypes/PokemonTypesHero2_w720.jpg").into(imageView);

    }
}
