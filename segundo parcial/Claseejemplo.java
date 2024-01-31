import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Claseejemplo {
    private JFrame frame;
    private JTextField nameField;
    private JTextField usernameField;

    private MongoDBConnector connector;

    public GUI() {
        // Inicializar la conexión a MongoDB
        connector = new MongoDBConnector();

        // Crear y configurar la ventana
        frame = new JFrame("MongoDB CRUD Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Crear componentes
        nameField = new JTextField();
        usernameField = new JTextField();
        JButton saveButton = new JButton("Guardar");

        // Configurar disposición de componentes
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Nombre:"));
        frame.add(nameField);
        frame.add(new JLabel("Usuario:"));
        frame.add(usernameField);
        frame.add(saveButton);

        // Configurar acción del botón
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveUser();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    // Método para guardar un usuario en MongoDB
    private void saveUser() {
        String name = nameField.getText();
        String username = usernameField.getText();

        // Crear un nuevo objeto User y guardarlo en la base de datos
        User user = new User(name, username);
        connector.getCollection().insertOne(user.toDocument());

        // Limpiar los campos después de guardar
        nameField.setText("");
        usernameField.setText("");
    }

    // Método principal
    public static void main(String[] args) {
        // Iniciar la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
