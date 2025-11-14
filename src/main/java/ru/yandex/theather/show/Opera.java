package ru.yandex.theather.show;

import ru.yandex.theather.person.Actor;
import ru.yandex.theather.person.Director;
import ru.yandex.theather.person.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, double duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
