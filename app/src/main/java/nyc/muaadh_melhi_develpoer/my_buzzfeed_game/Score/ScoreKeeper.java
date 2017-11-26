package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score;

import java.util.ArrayList;

public class ScoreKeeper {
    private static int score;
    public static ArrayList<String> userChoiceList = new ArrayList<>();

    public static void changeScore(int change) {
        score += change;
    }

    public static int getScore() {
        return score;
    }

    public static void setUserChoiceList(String userChoise) {
        userChoiceList.add(userChoise);
    }


}
