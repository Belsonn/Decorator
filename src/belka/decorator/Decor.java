package belka.decorator;

public abstract class Decor implements Computer {

    protected Computer computer;

    public Decor(Computer newComputer)
    {
        computer = newComputer;
    }

    public String getDescription()
    {
        return computer.getDescription();
    }

    public double getPrice()
    {
        return computer.getPrice();
    }
}
