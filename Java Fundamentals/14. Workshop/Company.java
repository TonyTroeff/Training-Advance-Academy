import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private final String id;
    private final String name;
    private final String website;
    private final int yearOfEstablishment;
    private final List<Employee> employees;

    public Company(String id, String name) {
        this(id, name, null);
    }

    public Company(String id, String name, String website) {
        this(id, name, website, -1);
    }

    public Company(String id, String name, String website, int yearOfEstablishment) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.yearOfEstablishment = yearOfEstablishment;

        this.employees = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(this.employees);
    }

    public void addEmployee(Employee employee) {
        if (employee == null) throw new IllegalArgumentException("Employee cannot be null");
        this.employees.add(employee);
    }

    public double calculateMonthlyExpenses() {
        return this.employees.stream().mapToDouble(Employee::getSalary).sum();
    }
}
