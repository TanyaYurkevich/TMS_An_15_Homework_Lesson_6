import java.util.Objects;
/*Создать класс для описания студента нашей группы.
Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию)Переопределить в классе методы toString,hashcode и equals.
Создать несколько экземпляров класса с одним и тем же значением
полей и сравнить с помощью метода equals.
*/


public class Students {
    String name;
    String surname;
    int age;
    String groupNumber;
    String gender ;

    public Students(String n, String sn, int a, String gN, String g) {
        this.name = n;
        this.surname = sn;
        this.age = a;
        this.groupNumber = gN;
        this.gender = g;

    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", groupNumber='" + groupNumber + '\'' +
                ", flor='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name) && Objects.equals(surname, students.surname) && Objects.equals(groupNumber, students.groupNumber) && Objects.equals(flor, students.flor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, groupNumber, gender);
    }
}

