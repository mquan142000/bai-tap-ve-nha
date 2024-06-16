import java.util.Scanner;

public class EmployeeManagementApp {
    private static EmployeeManager employeeManager = new EmployeeManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Display Employee Count");
            System.out.println("5. Display Employees By Type");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    removeEmployee(scanner);
                    break;
                case 3:
                    employeeManager.displayAllEmployees();
                    break;
                case 4:
                    employeeManager.displayEmployeeCount();
                    break;
                case 5:
                    displayEmployeesByType(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter Employee Type (Office/Factory/Delivery): ");
        String type = scanner.nextLine();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "office":
                employeeManager.addEmployee(new OfficeEmployee(id, name, phone, position));
                break;
            case "factory":
                System.out.print("Enter Factory Code: ");
                String factoryCode = scanner.nextLine();
                System.out.print("Enter Type: ");
                String factoryType = scanner.nextLine();
                employeeManager.addEmployee(new FactoryEmployee(id, name, phone, position, factoryCode, factoryType));
                break;
            case "delivery":
                System.out.print("Enter Vehicle Type: ");
                String vehicleType = scanner.nextLine();
                employeeManager.addEmployee(new DeliveryEmployee(id, name, phone, position, vehicleType));
                break;
            default:
                System.out.println("Invalid Employee Type");
        }
    }

    private static void removeEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to remove: ");
        String id = scanner.nextLine();
        employeeManager.removeEmployee(id);
    }

    private static void displayEmployeesByType(Scanner scanner) {
        System.out.print("Enter Employee Type to display (Office/Factory/Delivery): ");
        String type = scanner.nextLine();
        switch (type.toLowerCase()) {
            case "office":
                employeeManager.displayEmployeesByType(OfficeEmployee.class);
                break;
            case "factory":
                employeeManager.displayEmployeesByType(FactoryEmployee.class);
                break;
            case "delivery":
                employeeManager.displayEmployeesByType(DeliveryEmployee.class);
                break;
            default:
                System.out.println("Invalid Employee Type");
        }
    }
}
