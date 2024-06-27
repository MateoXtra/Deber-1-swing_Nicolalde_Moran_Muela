import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane((new Form()).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.pack();
        frame.setVisible(true);

    }
}