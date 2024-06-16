public class FactoryEmployee extends AbstractEmployee {
    private String factoryCode;
    private String type;

    public FactoryEmployee(String id, String name, String phone, String position, String factoryCode, String type) {
        super(id, name, phone, position);
        this.factoryCode = factoryCode;
        this.type = type;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Factory Code: " + factoryCode);
        System.out.println("Type: " + type);
    }
}
