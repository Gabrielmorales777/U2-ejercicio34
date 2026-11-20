
import java.util.ArrayList;
import java.util.List;

public class GestorAuditoria {

    private List<DestinoLog> destinos;

    public GestorAuditoria() {
        destinos = new ArrayList<>();
    }

    public void agregarDestino(DestinoLog destino) {
        destinos.add(destino);
    }

    public void difundirRegistro(String nivel, String mensaje) {

        if (destinos.isEmpty()) {
            System.out.println("No hay destinos de almacenamiento registrados.");
            return;
        }

        System.out.println("Difundiendo registro a todos los destinos...\n");

        for (DestinoLog destino : destinos) {
            destino.guardarRegistro(nivel, mensaje);
            System.out.println();
        }
    }
}
