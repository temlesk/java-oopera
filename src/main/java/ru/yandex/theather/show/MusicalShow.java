package ru.yandex.theather.show;

import ru.yandex.theather.person.Actor;
import ru.yandex.theather.person.Director;
import ru.yandex.theather.person.Person;

import java.util.ArrayList;

public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println(librettoText);
    }
}
