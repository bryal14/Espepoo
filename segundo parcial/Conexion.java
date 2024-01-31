/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Bryan
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Conexion {
    private final String host = "localhost";
    private final int port = 27017;
    private final String databaseName = "Running.e"; // Nombre de la base de datos

    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDatabase getConexion() {
        try {
            // Crea una conexión a MongoDB
            mongoClient = MongoClients.create("mongodb://" + host + ":" + port);

            // Accede a la base de datos
            database = mongoClient.getDatabase(databaseName);
            System.out.println("Se conectó a la base de datos " + databaseName);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return database;
    }

    public void cerrarConexion() {
        try {
            if (mongoClient != null) {
                mongoClient.close();
                System.out.println("Conexión cerrada");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
