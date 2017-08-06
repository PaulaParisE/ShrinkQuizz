package cl.paula.shrinkquizz;

/**
 * Created by paula_000 on 05-08-2017.
 */

public class MatchResult {

    private int userAge;
    private int loverAge;


    public MatchResult(int userAge, int loverAge) {
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
