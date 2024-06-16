public abstract class AbstractEmployee implements Employee {
    protected String id;
    protected String name;
    protected String phone;
    protected String position;

    public AbstractEmployee(String id, String name, String phone, String position) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.position = position;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Position: " + position);
    }
}
