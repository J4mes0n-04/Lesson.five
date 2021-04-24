package geekbrains_lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Стас Орехов", "Директор",
                        "so@roor.ru", "+73884756943", 500000, 18),
                new Employee("Толик Плюшкин", "Охранник",
                        "tp@roor.ru", "+73456854344", 150000, 43),
                new Employee("Петр Мишкин", "Супер Охранник",
                        "pm@roor.ru", "+74567987645", 5000, 55),
                new Employee("Катя Петрова", "Ведущий разработчик",
                        "kp@roor.ru", "+79995554678", 180000, 29),
                new Employee("Лариса Долина", "Тестеровщик",
                        "ld@roor.ru", "+72224564447", 85000, 45),
        };

        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
