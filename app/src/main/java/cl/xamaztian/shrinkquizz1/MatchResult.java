package cl.xamaztian.shrinkquizz1;

/**
 * Created by Xamaztian on 03-04-2018.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    public String getUserMatch(){
        return calcMatch();
    }

    private String calcMatch(){
        int result = getUserAge() - getLoverAge();

        if (result == 0)
            return "Van bien";
        else if (result < 0)
            return "Buen futuro";
        else
            return "Siga participando";
    }
}
