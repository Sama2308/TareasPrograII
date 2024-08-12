# Sistema de Gestión de Eventos Deportivos

## Descripción del Proyecto

Este proyecto es un sistema de gestión de eventos deportivos desarrollado en Java. Permite a los organizadores de eventos realizar las siguientes operaciones:

- **Registrar nuevos eventos deportivos:** Cada evento tiene un nombre, una descripción, una fecha y hora de inicio, una fecha y hora de finalización, y una lista de participantes.
- **Registrar nuevos participantes:** Cada participante tiene un nombre, un ID único y una lista de eventos en los que está registrado.
- **Asignar participantes a eventos:** Permite asignar uno o varios participantes a un evento específico.
- **Registrar resultados de eventos:** Permite registrar los resultados de los eventos, incluyendo el ganador y las posiciones de los participantes.
- **Consultar información:** Permite consultar la lista de eventos, los participantes asociados a un evento específico y los resultados de los eventos.

## Requisitos

### Específicos

- **POO y Principios del POO:**
  - Utiliza clases y objetos para representar eventos, participantes y resultados.
  - Implementa herencia, polimorfismo, abstracción y encapsulamiento.
  - La clase base `Persona` es derivada por la clase `Participante`.
  - Clases adicionales incluyen `Evento` y `Resultado`.

- **Lógica de Programación:**
  - Uso de estructuras de control (`if`, `for`, `foreach`, `switch`).
  - Validación de fechas y horas.
  - Verificación de que los participantes no se dupliquen en un evento.
  - Implementación de funcionalidades para registrar resultados y verificar el estado de los eventos.

- **Colecciones:**
  - Uso de colecciones (`List`, `Map`, `Set`) para gestionar eventos, participantes y resultados.
  - Uso de un `Map` para asignar participantes a eventos.

- **Excepciones:**
  - Manejo adecuado de excepciones.
  - Definición de excepciones personalizadas como `EventoNoEncontradoException` y `ParticipanteNoEncontradoException`.

## Instalación y Ejecución

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/tuusuario/tu-repositorio.git
