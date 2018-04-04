package cl.xamaztian.shrinkquizz1;

import android.app.AlertDialog;
import android.content.DialogInterface;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Xamaztian on 03-04-2018.
 */

public class LuckyAnswer {
    private boolean userInput;
    private boolean luckyDay;

    public LuckyAnswer(boolean userInput) {
        this.userInput = userInput;
        luckyDay = new LuckyDate().getLuckyDay();
    }

    public boolean isUserInput() {
        return userInput;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate {


        public boolean getLuckyDay() {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));

            if ((day % 2) == 0)
                return true;
            else
                return false;
        }
    }


}
