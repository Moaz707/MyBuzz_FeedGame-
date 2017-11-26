package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.R;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model.ZombieDataModel;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.views.ZombieViewHolder;

public class ZombieAdapter extends RecyclerView.Adapter<ZombieViewHolder> {
    private List<ZombieDataModel> infoGame;

    public ZombieAdapter(List<ZombieDataModel> infoGame) {
        this.infoGame = infoGame;
    }

    @Override
    public ZombieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);
        return new ZombieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ZombieViewHolder holder, int position) {
        holder.onBind(infoGame.get(position));

    }

    @Override
    public int getItemCount() {
        return infoGame.size();
    }
}
