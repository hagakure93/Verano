package tema8_Almacenamiento.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;



public class EjemploMySQL_Insert {

    public static void main(String[] args) {

        try {

            // Datos del contacto a insertar
            String nombre = "Pablo;";
            String correo = nombre.replaceAll(" ", "_").toLowerCase() + "@aulaenlanube.com";
            int edad = new Random().nextInt(18,25);
            // realizamos conexión
            Connection conex = ConexionBD.conectar("agenda");

            // insertamos contacto
            String query = "INSERT INTO contacto VALUES (?,?,?)";
            PreparedStatement queryInsert = conex.prepareStatement(query);
            queryInsert.setString(1, nombre);
            queryInsert.setString(2, correo);
            queryInsert.setInt(3, edad);
            int resultado = queryInsert.executeUpdate();

            // analizamos el resultado del insert
            if (resultado == 1)
                System.out.println("El Contacto de nombre '" + nombre + "' se ha insertado correctamente");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
