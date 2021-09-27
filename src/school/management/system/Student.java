package school.management.system;

//This class is respnsible for keep the track of students fees, name, id, grade and fees paid

public class Student {

    private int id;
    private String name;


    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name
                + "\nTotal fees paid so far $" + feesPaid;
    }
}
