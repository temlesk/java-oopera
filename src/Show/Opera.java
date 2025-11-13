package Show;

import Person.Actor;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, double duration, String director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
