
public class LogBaseDatos implements DestinoLog {

    @Override
    public void guardarRegistro(String nivel, String mensaje) {

        System.out.println("=== BASE DE DATOS ===");
        System.out.println("Estableciendo conexion con la base de datos...");
        System.out.println("Nivel: " + nivel);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Registro insertado en la base de datos.");
    }
}
