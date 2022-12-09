package solid.isp;

public class DeLorean implements Car {

    @Override
    public void speedUp() {
        System.out.println("The DeLorean is increasing his speed");
    }

    @Override
    public void brake() {
        System.out.println("The DeLorean is decreasing his speed");
    }
    
}
