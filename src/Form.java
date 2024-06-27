import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JButton btn3;
    public JPanel panel1;
    private JButton btn4;
    private JButton btn2;
    private JButton btn1;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JTextField imput2;
    private JTextField imput1;
    private JButton borrarButton;
    private JButton btn9;
    private JButton btn5;
    private JLabel resultado;
    private JLabel resultado1;


    public Form() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                resultado.setText(String.valueOf(numero1 + numero2));
                resultado1.setText(null);
            }
        });
    }
}
