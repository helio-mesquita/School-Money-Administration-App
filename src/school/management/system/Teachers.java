package school.management.system;

public class Teachers {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary)
    {
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                + "\nTotal salay earned so far $" + salaryEarned;
    }
}
