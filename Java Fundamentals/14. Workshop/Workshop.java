import java.util.*;

/*
cmp1
Advance Academy
https://advanceacademy.bg
2000

emp1
cmp1
George Smith
Sofia
1200

emp2
cmp1
Bryan Day
Varna
3624.37

cmp2
W3Schools
https://w2schools.com
1995

emp3
cmp2
Will Higgins
Burgas
2514.06

McDonnalds
https://mcdonalds.com
1973
*/
public class Workshop {
    private static Comparator<Company> lexicographicCompanyComparator = Comparator.comparing(Company::getName);
    private static Comparator<Employee> salaryEmployeeComparator = Comparator.comparing(Employee::getSalary, Comparator.reverseOrder());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Company> companies = new HashMap<>();
        Map<String, Employee> employees = new HashMap<>();

        int commandId = readCommandId(scanner);
        while (commandId != 0) {
            if (commandId == 1) {
                addNewCompany(companies, scanner);
            }
            else if (commandId == 2) {
                addNewEmployee(employees, companies, scanner);
            }
            else if (commandId == 5) {
                listAllCompanies(companies);
            }
            else if (commandId == 6) {
                listAllEmployees(employees);
            }
            else if (commandId == 7) {
                listAllEmployeesByCompany(companies, scanner);
            }
            else if (commandId == 8) {
                calculateMonthlyExpenses(companies);
            }

            System.out.println();
            commandId = readCommandId(scanner);
        }
    }

    public static void addNewCompany(Map<String, Company> companies, Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        if (companies.containsKey(id)) {
            System.out.println("Company already exists");
            return;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter website: ");
        String website = scanner.nextLine();

        System.out.print("Enter year of establishment: ");
        int yearOfEstablishment = Integer.parseInt(scanner.nextLine());

        Company company = new Company(id, name, website, yearOfEstablishment);
        companies.put(id, company);
    }

    private static void addNewEmployee(Map<String, Employee> employees, Map<String, Company> companies, Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        if (employees.containsKey(id)) {
            System.out.println("Employee already exists");
            return;
        }

        System.out.print("Enter company ID: ");
        String companyId = scanner.nextLine();

        Company company = companies.get(companyId);
        if (company == null) {
            System.out.println("Company does not exist");
            return;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(id, name, address, company, salary);
        employees.put(id, employee);
    }

    public static void listAllCompanies(Map<String, Company> companies) {
        companies.values().stream().sorted(lexicographicCompanyComparator)
                .forEach(c -> System.out.printf("%s: %s, %d%n", c.getId(), c.getName(), c.getYearOfEstablishment()));
    }

    private static void listAllEmployees(Map<String, Employee> employees) {
        employees.values().stream().sorted(salaryEmployeeComparator)
                .forEach(e -> System.out.printf("%s: %s, $%f -> %s (%s)%n", e.getId(), e.getName(), e.getSalary(), e.getCompany().getName(), e.getCompany().getId()));
    }

    private static void listAllEmployeesByCompany(Map<String,Company> companies, Scanner scanner) {
        System.out.print("Enter company ID: ");
        String companyId = scanner.nextLine();

        Company company = companies.get(companyId);
        if (company == null) {
            System.out.println("Company does not exist");
            return;
        }

        company.getEmployees().stream().sorted(salaryEmployeeComparator)
                .forEach(e -> System.out.printf("%s: %s, %s, $%f%n", e.getId(), e.getName(), e.getAddress(), e.getSalary()));
    }

    private static void calculateMonthlyExpenses(Map<String,Company> companies) {
        companies.values().stream().sorted(lexicographicCompanyComparator)
                .forEach(c -> System.out.printf("%s: %s, $%f%n", c.getId(), c.getName(), c.calculateMonthlyExpenses()));
    }

    public static int readCommandId(Scanner scanner) {
        printMenu();

        int commandId = Integer.parseInt(scanner.nextLine());
        return commandId;
    }

    public static void printMenu() {
        System.out.println("Please, select an option:");
        System.out.println("1. Add a new company");
        System.out.println("2. Add a new employee");
        System.out.println("5. List all companies");
        System.out.println("6. List all employees");
        System.out.println("7. List all employees by company");
        System.out.println("8. Calculate monthly expenses");
        System.out.println("0. Exit");
    }
}
