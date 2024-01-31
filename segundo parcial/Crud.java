package crud;

import Controlador.Controlador;
import Modelo.Tiemposdecarrera;
import Vista.TiempoCarreraView;

public class Crud {

    public static void main(String[] args) {
        // Crear instancias del modelo, consultas y vista
        Tiemposdecarrera modelo = new Tiemposdecarrera();
        Consultadetiemposdecarrera consultas = new Consultadetiemposdecarrera();
        TiempoCarreraView vista = new TiempoCarreraView();

        // Crear instancia del controlador y pasar las instancias del modelo, consultas y vista
        var controlador = new Controlador(modelo, vista, consultas);

        // Iniciar el controlador
        controlador.iniciar();

        // Hacer visible la vista
        vista.setVisible(true);
    }

    public static class Consultadetiemposdecarrera {

        public Consultadetiemposdecarrera() {
        }

        // Métodos para operaciones en la base de datos
        public boolean guardarTiempoCarrera(Tiemposdecarrera tiempoCarrera) {
            // Lógica para guardar en la base de datos
            // ...
            return true; // o false dependiendo del resultado
        }

        public boolean modificarTiempoCarrera(Tiemposdecarrera tiempoCarrera) {
            // Lógica para modificar en la base de datos
            // ...
            return true; // o false dependiendo del resultado
        }

        public boolean eliminarTiempoCarrera(Tiemposdecarrera tiempoCarrera) {
            // Lógica para eliminar en la base de datos
            // ...
            return true; // o false dependiendo del resultado
        }

        // Otros métodos que puedas necesitar
    }
}
