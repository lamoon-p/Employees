public class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null) {
            System.out.println("Please enter name with letters only");

        } else {
            this.name = name;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        if (salary >= 0) {
            this.salary = salary;

        } else {
            this.salary = 0;
        }
    }

    public static void calculateSalary(Employee employee) {

        // salary before update
        System.out.println("Name: " + employee.getName() + " Original salary: " + employee.getSalary());

        // update salary
        employee.setSalary((int) (employee.getSalary() * 1.15));
        System.out.println("Name: " + employee.getName() + " Salary raised to: " + employee.getSalary());
    }
}
