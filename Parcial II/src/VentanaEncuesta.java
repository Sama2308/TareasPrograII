import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEncuesta extends JFrame {
    private Encuesta encuesta;
    private JLabel etiquetaPregunta;
    private JTextField campoRespuesta;
    private JButton botonSiguiente;
    private JButton botonEnviar;

    public VentanaEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
        initGUI();
    }

    private void initGUI() {
        // Crear componentes de la interfaz gráfica
        etiquetaPregunta = new JLabel();
        campoRespuesta = new JTextField();
        botonSiguiente = new JButton("Siguiente");
        botonEnviar = new JButton("Enviar");

        // Configurar el layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(etiquetaPregunta, BorderLayout.NORTH);
        panel.add(campoRespuesta, BorderLayout.CENTER);
        panel.add(botonSiguiente, BorderLayout.EAST);
        panel.add(botonEnviar, BorderLayout.SOUTH);

        // Agregar listeners de acción
        botonSiguiente.addActionListener(new ListenerBotonSiguiente());
        botonEnviar.addActionListener(new ListenerBotonEnviar());

        // Configurar la ventana
        add(panel);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ListenerBotonSiguiente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener la siguiente pregunta
            Pregunta pregunta = encuesta.getSiguientePregunta();
            if (pregunta != null) {
                etiquetaPregunta.setText(pregunta.getTexto());
                campoRespuesta.setText("");
            } else {
                // No hay más preguntas, mostrar mensaje de confirmación
                JOptionPane.showMessageDialog(VentanaEncuesta.this, "¡Gracias por completar la encuesta!");
                dispose();
            }
        }
    }

    private class ListenerBotonEnviar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Almacenar la respuesta y mostrar mensaje de confirmación
            encuesta.guardarRespuesta(campoRespuesta.getText());
            JOptionPane.showMessageDialog(VentanaEncuesta.this, "¡Gracias por completar la encuesta!");
            dispose();
        }
    }
}