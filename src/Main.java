import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teacher {
    private String name;
    private int rating;

    public Teacher(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + ", рейтинг: " + rating;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        // Додавання вчителів у список
        teachers.add(new Teacher("Василь", 9));
        teachers.add(new Teacher("Олена", 8));
        teachers.add(new Teacher("Михайло", 7));
        teachers.add(new Teacher("Наталія", 10));
        teachers.add(new Teacher("Петро", 6));

        // Виведення списку вчителів у консоль
        System.out.println("Список вчителів:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        // Знаходження індексу найкращого та найгіршого вчителя
        int bestTeacherIndex = 0;
        int worstTeacherIndex = 0;

        for (int i = 1; i < teachers.size(); i++) {
            if (teachers.get(i).getRating() > teachers.get(bestTeacherIndex).getRating()) {
                bestTeacherIndex = i;
            }
            if (teachers.get(i).getRating() < teachers.get(worstTeacherIndex).getRating()) {
                worstTeacherIndex = i;
            }
        }

        // Виведення інформації про найкращого та найгіршого вчителя
        System.out.println("Найкращий вчитель: " + teachers.get(bestTeacherIndex));
        System.out.println("Найгірший вчитель: " + teachers.get(worstTeacherIndex));
    }
}
