//
//Created by glazyrin Maksim
//
package geekbrains_lesson5;

public class Employee {

    private String name; //ФИО
    private String position; //должность
    private String email; //емейл
    private String phone; //номер телефона
    private int salary; //зарплата
    private int age; //возраст

    // это конструктор
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        String infoMassage = "Employee: %s\nPosition: %s\nEmail: %s\nPhone: %s\nSalary: %d\nAge %d\n\n";
        System.out.printf(infoMassage, name, position, email, phone, salary, age);
    }

    // это метод вывода в консоль (как по заданию)
    public int getAge () {
        return age;
    }
}
