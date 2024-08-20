public class Employee {
    // Nitelikler (fields)
    private String name;
    private int employeeId;
    private double baseSalary;
    private double bonus;

    // Constructor
    public Employee(String name, int employeeId, double baseSalary, double bonus) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Getter ve Setter metodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Metodlar

    // Maaşı hesaplayan metod
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Çalışanın bilgilerini döndüren metod
    public String getEmployeeDetails() {
        return "Name: " + name + ", Employee ID: " + employeeId + ", Base Salary: " + baseSalary + ", Bonus: " + bonus;
    }

    // Bonus ekleyen metod
    public void addBonus(double additionalBonus) {
        this.bonus += additionalBonus;
    }

    // Maaş güncelleme metodunu tanımlama
    public void updateBaseSalary(double newBaseSalary) {
        this.baseSalary = newBaseSalary;
    }

    // Çalışan bilgilerini güncelleme metodunu tanımlama
    public void updateEmployeeDetails(String newName, int newEmployeeId, double newBaseSalary, double newBonus) {
        this.name = newName;
        this.employeeId = newEmployeeId;
        this.baseSalary = newBaseSalary;
        this.bonus = newBonus;
    }

    // Main metoduyla sınıfı test etme
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 1234, 50000.0, 5000.0);
        System.out.println(emp.getEmployeeDetails());
        System.out.println("Total Salary: " + emp.calculateSalary());

        emp.addBonus(1000.0);
        System.out.println("Updated Total Salary: " + emp.calculateSalary());

        emp.updateBaseSalary(55000.0);
        System.out.println("Updated Details: " + emp.getEmployeeDetails());

        emp.updateEmployeeDetails("Jane Doe", 5678, 60000.0, 6000.0);
        System.out.println("Final Details: " + emp.getEmployeeDetails());
        System.out.println("Final Total Salary: " + emp.calculateSalary());
    }
}