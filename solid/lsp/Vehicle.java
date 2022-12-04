package solid.lsp;

public class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return "The vehicle name is: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
