import javax.swing.*;

public class TronRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 900;
    private final Base b;
    public TronRunner()
    {
        super("Tron");

        setSize(WIDTH, HEIGHT);

        b = new Base();
        add(b);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        TronRunner run = new TronRunner();
    }
}