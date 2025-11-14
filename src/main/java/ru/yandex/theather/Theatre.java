package ru.yandex.theather;

import ru.yandex.theather.person.Actor;
import ru.yandex.theather.person.Director;
import ru.yandex.theather.person.Gender;
import ru.yandex.theather.person.Person;
import ru.yandex.theather.show.Show;
import ru.yandex.theather.show.Opera;
import ru.yandex.theather.show.Ballet;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args){
        Actor actor1 = new Actor("Иван", "Пушкин", Gender.MALE, 175);
        Actor actor2 = new Actor("Андрей", "Калачиков", Gender.MALE, 155);
        Actor actor3 = new Actor("Инна", "Бехер", Gender.FEMALE, 180);

        Director director1 = new Director("Авраам", "Линкольн", Gender.MALE, 5);
        Director director2 = new Director("Марго", "Абрамова", Gender.FEMALE, 8);

        Person musicalAuthor1 = new Person("Спритн", "Алишер", Gender.MALE);

        Person choreographer1 = new Person("Мигель", "Абрамов", Gender.MALE);

        Show show = new Show("Показ мод", 2.5, director1, new ArrayList<Actor>());
        Opera opera = new Opera("Коза", 1.5, director1, new ArrayList<Actor>(),
                musicalAuthor1, "Синимй трактор едет к нам", 5);
        Ballet ballet = new Ballet("Лебединное озеро", 5, director2, new ArrayList<Actor>(),
                musicalAuthor1, "По полям, по полям", choreographer1);

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Список актеров в обычном спектакле:");
        show.printAllActors();
        System.out.println("\nСписок актеров в опере:");
        opera.printAllActors();
        System.out.println("\nСписок актеров на балете:");
        ballet.printAllActors();


        Actor actorReplace = new Actor("Артем", "Лешкин", Gender.MALE, 177);
        show.replaceActorBySurname(actorReplace, "Пушкин");

        System.out.println();
        show.printAllActors();

        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();
    }
}
