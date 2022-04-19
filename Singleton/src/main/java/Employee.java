public class Employee {

    private String name;
    private float salary;
    private boolean goalAchieved;
    private float salaryWithBonus;

    public Employee(String name, float salary, boolean goalAchieved) {
        this.name = name;
        this.salary = salary;
        this.goalAchieved = goalAchieved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isGoalAchieved() {
        return goalAchieved;
    }

    public void setGoalAchieved(boolean goalAchieved) {
        this.goalAchieved = goalAchieved;
    }

    public void calculateSalaryWithBonus() {
        this.salaryWithBonus = this.salary * BonusEmployee.getInstance().getBonusEmployeePercentage();
    }
}
