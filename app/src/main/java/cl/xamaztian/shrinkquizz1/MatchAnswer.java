package cl.xamaztian.shrinkquizz1;

/**
 * Created by Xamaztian on 03-04-2018.
 */

public class MatchAnswer {
    private int userAge;
    private int loverAge;

    public MatchAnswer(int userAge, int loverAge) {
        this.userAge = userAge;
        this.loverAge = loverAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }
}
