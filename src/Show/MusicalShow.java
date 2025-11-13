package Show;

import Person.Actor;

import java.util.ArrayList;

public class MusicalShow extends Show{
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, String director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println(librettoText);
    }
}
