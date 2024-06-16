import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }

    public void displayEmployeeCount() {
        System.out.println("Total employees: " + employees.size());
        long officeCount = employees.stream().filter(e -> e instanceof OfficeEmployee).count();
        long factoryCount = employees.stream().filter(e -> e instanceof FactoryEmployee).count();
        long deliveryCount = employees.stream().filter(e -> e instanceof DeliveryEmployee).count();

        System.out.println("Office employees: " + officeCount);
        System.out.println("Factory employees: " + factoryCount);
        System.out.println("Delivery employees: " + deliveryCount);
    }

    public void displayEmployeesByType(Class<? extends Employee> type) {
        for (Employee employee : employees) {
            if (type.isInstance(employee)) {
                employee.displayInfo();
                System.out.println();
            }
        }
    }
}
