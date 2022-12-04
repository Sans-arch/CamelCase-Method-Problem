package solid.lsp;

public class Car extends Vehicle {
    private int doorsQty;

    public Car(int doorsQty, String name) {
        super(name);
        this.doorsQty = doorsQty;
    }

    public int getDoorsQty() {
        return doorsQty;
    }
    
    public void setDoorsQty(int doorsQty) {
        this.doorsQty = doorsQty;
    }
    
    public String getName() {
        return "The car name is: " + name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
