package belka.decorator;

public class Intel_i7 extends Decor{


    public Intel_i7(Computer newComputer) {
        super(newComputer);

        System.out.println("Adding Intel i7");
    }

    public String getDescription()
    {
        return computer.getDescription() + ", Intel i7";
    }

    public double getPrice()
    {
        return computer.getPrice() + 300.0;
    }
}
