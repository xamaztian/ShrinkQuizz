package cl.xamaztian.shrinkquizz1;

/**
 * Created by Xamaztian on 03-04-2018.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean userInput) {
        super(userInput);
    }

    private String answerToUser(){
        if (super.isUserInput())
            return "Esa es la actitud!";
        else
            return "Anímate!";
    }

    private String getLuckyAnswer(){
        if (super.isLuckyDay())
            return "y es tu día de suerte!";
        else
            return "vendrán tiempos mejores :)";
    }

    public String getLuckyMessage() {
        return answerToUser() + " " + getLuckyAnswer();
    }
}
