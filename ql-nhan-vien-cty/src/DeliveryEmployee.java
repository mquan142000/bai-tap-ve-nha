public class DeliveryEmployee extends AbstractEmployee {
    private String vehicleType;

    public DeliveryEmployee(String id, String name, String phone, String position, String vehicleType) {
        super(id, name, phone, position);
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
