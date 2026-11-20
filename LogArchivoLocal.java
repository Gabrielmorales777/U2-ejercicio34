
public class LogArchivoLocal implements DestinoLog {

    @Override
    public void guardarRegistro(String nivel, String mensaje) {

        System.out.println("=== ARCHIVO LOCAL ===");
        System.out.println("Abriendo archivo de logs...");
        System.out.println("Nivel: " + nivel);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Registro guardado en archivo local.");
    }
}
