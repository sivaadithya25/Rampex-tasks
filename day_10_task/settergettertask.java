class Car{
    private String name;
    private String CC;
    private int price;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCC(String CC) {
        this.CC = CC;
    }
    public String getCC() {
        return CC;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

}
public class GetterSetterCarProgram {
    public static void main(String[] args) {
        Car c= new Car();
        c.setName("Lexus");
        c.setCC("2000cc");
        c.setPrice(5000000);
        System.out.println("Car Name: "+c.getName());
        System.out.println("Car CC: "+c.getCC());
        System.out.println("Car Price: "+c.getPrice());
        c.setName("McLaren");
        c.setCC("3000cc");
        c.setPrice(7000000);
        System.out.println("Car Name: "+c.getName());
        System.out.println("Car CC: "+c.getCC());
        System.out.println("Car Price: "+c.getPrice());
    }
    
}
