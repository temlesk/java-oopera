package Person;

import java.util.Objects;

public class Actor extends Person {
    public double height;

    public Actor(String name, String surname, gender genders, double height) {
        this.name = name;
        this.surname = surname;
        this.genders = genders;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + "(" + genders + ")";

    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (this == object) return true;
        Actor actor = (Actor) object;
        return Double.compare(height, actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
