package belka.decorator;

public class GraphicCard  extends Decor{

    public GraphicCard(Computer newComputer) {
        super(newComputer);

        System.out.println("Adding Graphic Card");
    }

    public String getDescription()
    {
        return computer.getDescription() + ", Graphic Card";
    }

    public double getPrice()
    {
        return computer.getPrice() + 300.0;
    }
}
