package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score;

/**
 * Created by c4q on 11/19/17.
 */

public class Score {
    public static String scoreConverter(int score) {
        String result;
        if (score == 13) {
            result = " the grand pokemon master! Fantastic!";
        } else if (score >= 7 && score < 13) {
            result = "You are great and almost there to become a pokemon master!";

        } else if (score >= 4 && score < 7) {
            result = "cool, you know some pokemons, keep going!";

        } else if (score >= 1 && score < 4) {
            result = " a beginner, continue to pursue your pokemon master path.";
        } else {
            result = " nothing and don't know any Pokemon. Go catch some!";
        }
        return result;
    }

}
