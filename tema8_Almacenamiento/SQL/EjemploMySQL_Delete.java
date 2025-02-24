package tema8_Almacenamiento.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EjemploMySQL_Delete {

    public static void main(String[] args) {
        
            try {
    
                // realizamos conexión
                Connection conex = ConexionBD.conectar("Empresa");
    
                // insertamos contacto
                String query = "DELETE FROM Empleados WHERE edad = ?";
                PreparedStatement queryDelete = conex.prepareStatement(query);
                queryDelete.setInt(1, 18);
                int resultado = queryDelete.executeUpdate(); // Para saber si se ha borrado o no
    
                // analizamos el resultado del insert
                if (resultado > 0)
                    System.out.println("Se han borrado " + resultado + " empleados correctamente");
    
            } catch (SQLException e) {
                System.out.println(e);
            }
        

    }
}
