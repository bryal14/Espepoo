import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Definición de la clase Calculator
public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private JButton addButton, subButton, divButton, equalButton;
    private double firstNumber = 0.0;
    private double secondNumber = 0.0;
    private double result = 0.0;
    private int operator = 0;

    // Constructor de la calculadora
    public Calculator() {
        // Crear y configurar la ventana.
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 400);

        // Crear y configurar componentes
        textField = new JTextField();
        textField.setBounds(10, 10, 210, 40);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        addButton = new JButton("+");
        addButton.setBounds(10, 60, 50, 50);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar el botón de suma
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = 1;
            }
        });

        subButton = new JButton("-");
        

        equalButton = new JButton("=");
        equalButton.setBounds(190, 60, 50, 50);
        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar el botón de igual
                secondNumber = Double.parseDouble(textField.getText());

                switch (operator) {
                    case 1:
                        result = firstNumber + secondNumber;
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        break;
                    case 3:
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                            return;
                        }
                        break;
                    default:
                        break;
                }

                textField.setText(String.valueOf(result));
            }
        });

        // Colocar los componentes en la ventana
        frame.getContentPane().add(textField, BorderLayout.NORTH);
        frame.getContentPane().add(addButton, BorderLayout.WEST);
        frame.getContentPane().add(subButton, BorderLayout.CENTER);
        frame.getContentPane().add(divButton, BorderLayout.EAST);
        frame.getContentPane().add(equalButton, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.setVisible(true);
    }

    // Método principal
    public static void main(String[] args) {
        // Iniciar la calculadora al crear un objeto de la clase Calculator
        new Calculator();
    }
}

