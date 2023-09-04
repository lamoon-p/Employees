public class Main {

    public static void main(String[] args) {

        //create employees
        Employee employee1 = new Employee();
        employee1.setName(null);
        employee1.setName("Top");
        employee1.setJobTitle("Unemployed");
        employee1.setSalary(15000);

        Employee employee2 = new Employee();
        employee2.setName("Nan");
        employee2.setJobTitle("Shop Owner");
        employee2.setSalary(18000);

        // update and calculate salary
        Employee.calculateSalary(employee1);
        Employee.calculateSalary(employee2);
    }
}
