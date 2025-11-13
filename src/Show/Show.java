package Show;

import Person.Actor;
import java.util.ArrayList;

public class Show {
    public String title;
    public double duration;
    public String director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, String director, ArrayList<Actor> listOfActors) {
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
        if (newActor != null) {
            listOfActors.add(newActor);
        }
    }

    public void replaceActorBySurname(Actor newActor, String surnameToReplace) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (((Actor) listOfActors.get(i)).surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёра с такой фамилией не существует");
        }
    }

}
