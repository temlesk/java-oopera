import Person.Actor;
import Person.Director;
import Person.gender;
import Show.Show;
import Show.Opera;
import Show.Ballet;
import Show.MusicalShow;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args){
        Actor actor1 = new Actor("Иван", "Пушкин", gender.MALE, 175);
        Actor actor2 = new Actor("Андрей", "Калачиков", gender.MALE, 155);
        Actor actor3 = new Actor("Инна", "Бехер", gender.FEMALE, 180);
        Director director1 = new Director("Авраам", "Линкольн", gender.MALE, 5);
        Director director2 = new Director("Марго", "Абрамова", gender.FEMALE, 8);

        MusicalShow musicalAuthor = new MusicalShow("Показ мод", 2.5, "Жуков", new ArrayList<Actor>(), "Скрипт", "ОЙОЙОЙ");
        Ballet choreographer = new Ballet("Лебединное озеро", 5, "Пупкин", new ArrayList<Actor>(),
                "Кукушкин", "ИИИ", "Мигель");


        Show show = new Show("Показ мод", 2.5, "Жуков", new ArrayList<Actor>());
        Opera opera = new Opera("Коза", 1.5,"Копачев", new ArrayList<Actor>(),
                "Скриптонит", "Синимй трактор едет к нам", 5);
        Ballet ballet = new Ballet("Лебединное озеро", 5, "Пупкин", new ArrayList<Actor>(),
                "Кукушкин", "По полям, по полям", "Мигель");

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


        Actor actorReplace = new Actor("Артем", "Лешкин", gender.MALE, 177);
        show.replaceActorBySurname(actorReplace, "Пушкин");

        System.out.println();
        show.printAllActors();

        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();
    }
}
