package Controlador;

import Modelo.Tiemposdecarrera;
import Vista.TiempoCarreraView;
import crud.Crud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    private final Tiemposdecarrera modelo;
    private final TiempoCarreraView vista;
    private final Consultadetiemposdecarrera consultas;

    public Controlador(Tiemposdecarrera modelo, TiempoCarreraView vista, Consultadetiemposdecarrera consultas) {
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;

        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);

        iniciar();
    }

    public void iniciar() {
        vista.setTitle("Gestión de Tiempo de Carrera");
        vista.setLocationRelativeTo(null);
        vista.txtTiempoCarrera.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            guardarTiempoCarrera();
        } else if (e.getSource() == vista.btnModificar) {
            modificarTiempoCarrera();
        } else if (e.getSource() == vista.btnEliminar) {
            eliminarTiempoCarrera();
        }
    }

    private void guardarTiempoCarrera() {
        // Recopilar datos ingresados en la vista
        String tiempoCarrera = vista.txtTiempoCarrera.getText();

        // Establecer datos en el modelo
        modelo.setTiempoCarrera(tiempoCarrera);

        // Guardar en la base de datos usando el objeto consultas
        if (consultas.guardarTiempoCarrera(modelo)) {
            JOptionPane.showMessageDialog(null, "Tiempo de carrera guardado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar el tiempo de carrera");
        }
    }

    private void modificarTiempoCarrera() {
        // Recopilar datos ingresados en la vista
        int id = Integer.parseInt(vista.txtId.getText());
        String tiempoCarrera = vista.txtTiempoCarrera.getText();

        // Establecer datos en el modelo
        modelo.setId(id);
        modelo.setTiempoCarrera(tiempoCarrera);

        // Modificar en la base de datos usando el objeto consultas
        if (consultas.modificarTiempoCarrera(modelo)) {
            JOptionPane.showMessageDialog(null, "Tiempo de carrera modificado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar el tiempo de carrera");
        }
    }

    private void eliminarTiempoCarrera() {
    try {
        // Recopilar datos ingresados en la vista
        int id;
        id = Integer.parseInt(vista.txtId.getText());

        // Establecer datos en el modelo
        modelo.setId(id);

        // Eliminar en la base de datos usando el objeto consultas
        if (consultas.eliminarTiempoCarrera(modelo)) {
            JOptionPane.showMessageDialog(null, "Tiempo de carrera eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el tiempo de carrera");
        }
    } catch (NumberFormatException e) {
        // Manejar la excepción si la conversión no es exitosa
        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ID");
    }
}


    // Clase interna para las consultas de tiempos de carrera
    private static class Consultadetiemposdecarrera extends Crud.Consultadetiemposdecarrera {

        @Override
        public boolean eliminarTiempoCarrera(Tiemposdecarrera modelo) {
            // Lógica para eliminar tiempo de carrera en la base de datos
            // Devolver true si se realiza con éxito, false si hay algún error
            return false;
        }

        @Override
        public boolean guardarTiempoCarrera(Tiemposdecarrera modelo) {
            // Lógica para guardar tiempo de carrera en la base de datos
            // Devolver true si se realiza con éxito, false si hay algún error
            return false;
        }

        @Override
        public boolean modificarTiempoCarrera(Tiemposdecarrera modelo) {
            // Lógica para modificar tiempo de carrera en la base de datos
            // Devolver true si se realiza con éxito, false si hay algún error
            return false;
        }
    }
}
