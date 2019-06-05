package belka.decorator;

public class RAM4GB extends Decor {


    public RAM4GB(Computer newComputer) {
        super(newComputer);

        System.out.println("Adding 4GB RAM");

    }

    public String getDescription()
    {
        return computer.getDescription() + ", 4GB RAM";
    }

    public double getPrice()
    {
        return computer.getPrice() + 200.0;
    }
}
