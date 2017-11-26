package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score;

/**
 * Created by c4q on 11/25/17.
 */

public class ZombieScore {

    public static String scoreConverter(int score) {
        String result;
        if (score >= 10) {
            result = " care about friends and family from other zombies and bullies. " +
                    "'re usually calm and still enjoy being with family and friends even if you're in a zombie apocalypse. " +
                    "I hope you enjoyed the quiz. :D!";
        } else if (score >= 4 && score < 10) {
            result = "are Cool, You care about friends and family from other zombies and bullies., keep going,  but try harder!";
        } else {
            result = "  are zombie dude!,what's wrong with you";
        }
        return result;
    }

}

