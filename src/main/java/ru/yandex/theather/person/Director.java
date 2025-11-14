package ru.yandex.theather.person;

public class Director extends Person {
    protected int countShow;

    public Director(String name, String surname, Gender gender, int countShow) {
        super(name, surname, gender);
        this.countShow = countShow;
    }


    @Override
    public String toString() {
        return "Director{" +
                "countShow=" + countShow +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", genders=" + gender +
                '}';
    }
}

