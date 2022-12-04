package solid.lsp;

public class Example {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("Mustang");
        Car car = new Car(10, "Mustang");
        
        printName(vehicle);
        printName(car);
    }

    public static void printName(Vehicle vehicle) {
        System.out.println(vehicle.getName());
    }
}
