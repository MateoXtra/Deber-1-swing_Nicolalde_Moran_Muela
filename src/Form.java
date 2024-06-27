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
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                resultado.setText(String.valueOf(numero1 - numero2));
                resultado1.setText(null);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                resultado.setText(String.valueOf(numero1 * numero2));
                resultado1.setText(null);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                if (numero2 == 0) {
                    resultado.setText("IMPOSIBLE DIVIDIR POR 0");
                } else {
                    double res = numero1 / numero2;
                    String resultadoFormateado = String.format("%.2f", res);
                    resultado.setText(resultadoFormateado);
                }
                resultado1.setText(null);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                if (numero1 < 0 || numero2 < 0) {
                    resultado.setText("IMPOSIBLE RAIZ CUADRADA DE NEGATIVO");
                } else {
                    double result = Math.sqrt(numero1);
                    double resul1 = Math.sqrt(numero2);
                    resultado.setText(String.format("%.2f",result));
                    resultado1.setText(String.format("%.2f",resul1));
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                double resultadoPotencia = Math.pow(numero1, numero2);
                resultado.setText(String.format("%.2f", resultadoPotencia));
                resultado1.setText("No Valor");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                double resultadoSeno = Math.sin(Math.toRadians(numero1));
                double resultadoSeno1 = Math.sin(Math.toRadians(numero2));
                resultado1.setText(String.format("%.2f",resultadoSeno1));
                resultado.setText(String.format("%.2f", resultadoSeno));
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                double resultadoCoseno = Math.cos(Math.toRadians(numero1));
                double resultadoCoseno2 = Math.cos(Math.toRadians(numero2));
                resultado1.setText(String.format("%.2f", resultadoCoseno2));
                resultado.setText(String.format("%.2f", resultadoCoseno));
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(imput1.getText());
                Double numero2 = Double.parseDouble(imput2.getText());
                double resultadoTangente = Math.tan(Math.toRadians(numero1));
                double resultadoTangente2 = Math.tan(Math.toRadians(numero2));
                resultado1.setText(String.format("%.2f", resultadoTangente2));
                resultado.setText(String.format("%.2f", resultadoTangente));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(null);
                resultado1.setText(null);
            }
        });
    }
}
