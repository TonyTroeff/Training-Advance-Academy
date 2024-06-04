public class Employee {
    private final String id;
    private final String name;
    private final String address;
    private final Company company;
    private final double salary;

    public Employee(String id, String name, String address, Company company, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.company = company;
        this.salary = salary;

        company.addEmployee(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }
}
