package ru.yandex.theather.person;

import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + "(" + height + ")";

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) && Objects.equals(gender, actor.gender) &&
                (height == actor.height);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, gender, height);
    }
}
