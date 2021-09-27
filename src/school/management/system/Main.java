package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teachers lizzy = new Teachers(1, "Lizzy", 500);
        Teachers melissa = new Teachers(2, "Melissa", 700);
        Teachers vanderhorn = new Teachers(3,"Vanderhorn", 600);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(melissa);
        teachersList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2,"Rakshith",12);
        Student rahbi = new Student(3,"Rahbi", 5);

        List <Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rahbi);


        School ghs = new School(teachersList, studentList);

        Teachers megan = new Teachers(6, "Megan", 900);
        ghs.addTeacher(megan);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GRS gas earned: " + ghs.getTotalMoneyEarned());

        System.out.println("---------Making GHS PAY SALARY");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " an now has " + ghs.getTotalMoneyEarned());
        vanderhorn.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName() + " an now has " + ghs.getTotalMoneyEarned());
        System.out.println(rakshith);
        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
    }



}
