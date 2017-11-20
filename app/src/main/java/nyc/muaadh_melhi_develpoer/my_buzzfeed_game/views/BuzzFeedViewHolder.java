package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.views;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller.MyListener;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.DataModel;

/**
 * Created by Muaadh Melhi on 11/18/17.
 */

public class BuzzFeedViewHolder extends ViewHolder implements View.OnClickListener {
    TextView question;
    ImageView pic;
    Button answer1, answer2, answer3, answer4;
    MyListener listener;
    private int indexOfAnswer;

    public BuzzFeedViewHolder(View itemView) {
        super(itemView);

    }

    public void bind(DataModel dataModel, MyListener listener) {
        this.listener = listener;

        question = (TextView) itemView.findViewById(R.id.text_View);
        answer1 = (Button) itemView.findViewById(R.id.answer_1);
        answer2 = (Button) itemView.findViewById(R.id.answer_2);
        answer3 = (Button) itemView.findViewById(R.id.answer_3);
        answer4 = (Button) itemView.findViewById(R.id.answer_4);
        pic = (ImageView) itemView.findViewById(R.id.image_view);

        question.setText(dataModel.getQuizz());
        answer1.setText(dataModel.getAnswer1());
        answer2.setText(dataModel.getAnswer2());
        answer3.setText(dataModel.getAnswer3());
        answer4.setText(dataModel.getAnswer4());


        setUpButtons();

        // pic.setImageResource(dataModel.getPic());
        Picasso.with(itemView.getContext()).load(dataModel.getPic()).into(pic);

        indexOfAnswer = dataModel.getIndexOfAnswer();
    }

    private void setUpButtons() {
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);

        answer1.setEnabled(true);
        answer2.setEnabled(true);
        answer3.setEnabled(true);
        answer4.setEnabled(true);
    }


    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        Log.e(button.getText().toString(), "" + indexOfAnswer);
        listener.onOptionClicked(button.getText().toString(), indexOfAnswer);

        answer1.setEnabled(false);
        answer2.setEnabled(false);
        answer3.setEnabled(false);
        answer4.setEnabled(false);


    }

}
