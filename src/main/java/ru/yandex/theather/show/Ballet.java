package ru.yandex.theather.show;

import ru.yandex.theather.person.Actor;
import ru.yandex.theather.person.Director;
import ru.yandex.theather.person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected Person choreographer;

    public Ballet(String title, double duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
