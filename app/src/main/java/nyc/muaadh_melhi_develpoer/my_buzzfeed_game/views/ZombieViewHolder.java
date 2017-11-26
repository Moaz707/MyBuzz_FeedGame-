package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.views;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.ScoreKeeper;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.activity.ZombieActivity;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.ZombieDataModel;

/**
 * Created by c4q on 11/25/17.
 */

public class ZombieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    RadioButton radio1, radio2;
    RadioGroup radioGroup;
    TextView textQuiz;
    private RadioButton radio;

    public ZombieViewHolder(View itemView) {
        super(itemView);
    }


    public void onBind(ZombieDataModel dateModel) {

        final ImageView imageView = itemView.findViewById(R.id.image1);
        radioGroup = itemView.findViewById(R.id.radioGroup);
        textQuiz = itemView.findViewById(R.id.textquiz);
        radio1 = itemView.findViewById(R.id.radio1);
        radio1.setOnClickListener(this);
        radio2 = itemView.findViewById(R.id.radio2);
        radio2.setOnClickListener(this);
        Picasso.with(itemView.getContext()).load(dateModel.getDisplayImage()).into(imageView);
        textQuiz.setText(dateModel.getTextQuiz());
        radio1.setText(dateModel.choice1);
        radio2.setText(dateModel.choice2);
        radio1.setEnabled(true);
        radio2.setEnabled(true);


    }

    @Override
    public void onClick(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radio = (RadioButton) itemView.findViewById(radioId);
        radio1.setEnabled(false);
        radio2.setEnabled(false);
        ScoreKeeper.setUserChoiceList(radio.getText().toString());


        if (ScoreKeeper.userChoiceList.contains("My dog") || ScoreKeeper.userChoiceList.contains("No")) {
            ScoreKeeper.changeScore(-3);

        } else if (ScoreKeeper.userChoiceList.contains("The opposite of the Dark") || ScoreKeeper.userChoiceList.contains("NO on ,the world could be really crazy")) {
            ScoreKeeper.changeScore(+3);

        } else if (ScoreKeeper.userChoiceList.contains("yes")) {
            ScoreKeeper.changeScore(+10);
        } else {
            ScoreKeeper.changeScore(+1);
        }
        Log.d("score now is ", " " + ScoreKeeper.getScore());
        Log.d("userChoicelistSize is ", " " + ScoreKeeper.userChoiceList.size());
        if (ScoreKeeper.userChoiceList.size() == 8) {
            ((ZombieActivity) v.getContext()).myGame();
        }


    }
}
