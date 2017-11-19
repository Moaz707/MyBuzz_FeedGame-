package nyc.muaadh_melhi_develpoer.my_buzzfeed_game.model;

/**
 * Created by Muaadh Melhi on 11/18/17.
 */

public class DataModel {
    private final int indexOfAnswer;
    private String quizz ,answer1 ,answer2,answer3,answer4;
    private int pic;

    public DataModel(String quizz, String answer1, String answer2, String answer3, String answer4, int pic, int indexOfAnswer) {
        this.quizz = quizz;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.pic = pic;
        this.indexOfAnswer = indexOfAnswer;
    }
    public String getQuizz() {
        return quizz;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public int getPic() {
        return pic;
    }

    public int getIndexOfAnswer() {
        return indexOfAnswer;
    }
}