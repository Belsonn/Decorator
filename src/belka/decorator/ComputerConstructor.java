package belka.decorator;

public class ComputerConstructor {

    public static void main(String[] args)
    {
        Computer computer = new GraphicCard(new Intel_i7(new RAM4GB(new BasicComputer())));

        System.out.println(computer.getDescription());
        System.out.println(computer.getPrice());

        Computer c2 = new RAM4GB(new BasicComputer());

        System.out.println(c2.getDescription());
        System.out.println(c2.getPrice());

    }
}
