package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.DataModel;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.views.BuzzFeedViewHolder;

/**
 * Created by Muaadh Melhi on 11/18/17.
 */

public class BuzzFeedAdapter extends RecyclerView.Adapter<BuzzFeedViewHolder> {
    List<DataModel> gameList;


    private MyListener listener;

//    public void setGameList(List<DataModel> gameList) {
//        this.gameList = gameList;
//    }
//
//    public List<DataModel> getGameList() {
//        return gameList;
//    }

    public BuzzFeedAdapter(List<DataModel> gameList) {
        this.gameList = gameList;

    }

    @Override
    public BuzzFeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buzz_feed_layout, parent, false);

        return new BuzzFeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BuzzFeedViewHolder holder, int position) {
     //  BuzzFeedViewHolder buzzFeedViewHolder = (BuzzFeedViewHolder) holder;
        holder.bind(gameList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

    public void setListener(MyListener listener) {
        this.listener = listener;
    }

}
