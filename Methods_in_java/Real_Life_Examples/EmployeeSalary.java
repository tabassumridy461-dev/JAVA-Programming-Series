public class EmployeeSalary {

    String employeeName;
    double basicSalary;

    // Constructor
    EmployeeSalary(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Method to calculate bonus
    double calculateBonus() {
        return basicSalary * 0.10;
    }

    // Method to calculate total salary
    double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    // Method to display salary information
    void displaySalary() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[] args) {

        EmployeeSalary employee = new EmployeeSalary("Tabassum", 50000);

        employee.displaySalary();
    }
}

/*
Output:
Employee Name: Tabassum
Basic Salary: 50000.0
Bonus: 5000.0
Total Salary: 55000.0
*/
