# U2-ejercicio34
# Sistema de Exportación de Logs del Sistema

**Objetivo principal:** Desarrollar un sistema modular en Java que permita distribuir registros de auditoría a diferentes destinos de almacenamiento mediante una interfaz genérica.

El programa implementa la interfaz `DestinoLog` y tres destinos concretos: `LogArchivoLocal`, `LogBaseDatos` y `LogServicioNube`. La clase `GestorAuditoria` administra una lista de destinos y permite difundir registros de información o errores de manera masiva.

**Conceptos aplicados:**
- Interfaces y abstracción.
- Implementación de métodos.
- Polimorfismo.
- Encapsulamiento.
- Colecciones (`ArrayList` y `List`).
- Ciclo `for-each`.
- Desacoplamiento y modularidad.
- ![U2 ejercicio34](U2%20ejercicio34.png)
