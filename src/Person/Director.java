package Person;

public class Director extends Person {
    public int countShow;

    public Director(String name, String surname, gender genders, int countShow) {
        this.name = name;
        this.surname = surname;
        this.genders = genders;
        this.countShow = countShow;
    }


    @Override
    public String toString() {
        return "Director{" +
                "countShow=" + countShow +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", genders=" + genders +
                '}';
    }
}

