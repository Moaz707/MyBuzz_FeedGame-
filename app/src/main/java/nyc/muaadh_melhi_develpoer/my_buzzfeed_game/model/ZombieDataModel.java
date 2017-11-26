package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model;

/**
 * Created by c4q on 11/25/17.
 */

public class ZombieDataModel {

    int displayImage;
    public String choice1, choice2, textQuiz;

    public ZombieDataModel(int displayImage, String textQuiz, String choice1, String choice2) {
        this.displayImage = displayImage;
        this.textQuiz = textQuiz;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public String getTextQuiz() {
        return textQuiz;
    }


    public int getDisplayImage() {
        return displayImage;
    }


    public String getChoice1() {
        return choice1;
    }


    public String getChoice2() {
        return choice2;
    }

}
