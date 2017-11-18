package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.views;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
        pic.setImageResource(dataModel.getPic());

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.answer_1:
                listener.doStuff("This is answer 1");
                break;
        }
    }
}
