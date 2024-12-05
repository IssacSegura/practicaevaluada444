
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author issac
 */
class gestionMaraton {

    private participante[] participantes;
    private int totalParticipantes;

    //constructrs
    public gestionMaraton(int maxParticipantes) {
        this.participantes = new participante[maxParticipantes];
        this.totalParticipantes = 0;
    }

    //registrar un nuevo participante
    public void registrarParticipante() {
        if (totalParticipantes < participantes.length) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del participante:"));
            int numeroCorredor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de corredor único:"));
            double tiempoEstimado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo estimado (en minutos):"));

            participantes[totalParticipantes] = new participante(nombre, edad, numeroCorredor, tiempoEstimado);
            totalParticipantes++;
            JOptionPane.showMessageDialog(null, "Participante registrado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más participantes.");
        }
    }

    //listar todos los participantes
    public void listarParticipantes() {
        String lista = "participantes registrados:\n";
        for (int i = 0; i < totalParticipantes; i++) {
            lista += participantes[i].obtenerDetalles() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
