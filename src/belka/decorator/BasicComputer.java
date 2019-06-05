package belka.decorator;

public class BasicComputer implements Computer {


    @Override
    public String getDescription() {
        return "It has a Motherboard";
    }

    @Override
    public double getPrice() {
        return 500.0;
    }
}
