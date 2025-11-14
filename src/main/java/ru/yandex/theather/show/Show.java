package ru.yandex.theather.show;

import ru.yandex.theather.person.Actor;
import ru.yandex.theather.person.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printAllActors() {
        for (Actor actorInfo : listOfActors) {
            System.out.println(actorInfo);
        }
    }

    public void addActor(Actor newActor) {
        if (newActor != null){
            if (listOfActors.contains(newActor)) {
                System.out.println("Такой актер уже существует");
            }else{
                listOfActors.add(newActor);
            }
        }
    }

    public void replaceActorBySurname(Actor newActor, String surnameToReplace) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (((Actor) listOfActors.get(i)).surname.equals(surnameToReplace)) {
                count++;
            }if (count > 1){
                System.out.println("В списке есть несколько актеров с таким имененем");
                return;
            }
            listOfActors.set(i, newActor);
            found = true;
            break;
        }
        if (!found) {
            System.out.println("Актёра с такой фамилией не существует");
        }
    }

}
