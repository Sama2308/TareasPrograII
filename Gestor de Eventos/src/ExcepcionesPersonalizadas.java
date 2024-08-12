class EventoYaExisteException extends Exception {
    public EventoYaExisteException(String mensaje) {
        super(mensaje);
    }
}

class ParticipanteYaExisteException extends Exception {
    public ParticipanteYaExisteException(String mensaje) {
        super(mensaje);
    }
}

class EventoNoEncontradoException extends Exception {
    public EventoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class ParticipanteNoEncontradoException extends Exception {
    public ParticipanteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
