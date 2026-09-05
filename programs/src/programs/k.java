package programs;
class Employee {

    Integer empNo;
    String empName;
    Double salary;
    String hireDate;
    Double experience;

    Employee() {
        empNo = 101;
        empName = "Krishna";
        salary = 5000.0;
        hireDate = "04-Jul-2026";
        experience = 2.5;

        displayEmployeeDetails();
    }

    void displayEmployeeDetails() {

        Double annualSalary = salary * 12;
        Double annualBonus = annualSalary * 10 / 100;
        Double totalEarnings = annualSalary + annualBonus;

        System.out.println("Employee Details");
        System.out.println("----------------------------");
        System.out.println("Employee No     : " + empNo);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Monthly Salary  : " + salary);
        System.out.println("Hire Date       : " + hireDate);
        System.out.println("Experience      : " + experience + " Years");
        System.out.println("Annual Salary   : " + annualSalary);
        System.out.println("Annual Bonus    : " + annualBonus);
        System.out.println("Total Earnings  : " + totalEarnings);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

    }
}