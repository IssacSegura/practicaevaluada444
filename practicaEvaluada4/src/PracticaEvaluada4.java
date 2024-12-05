/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author issac
 */
public class PracticaEvaluada4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        gestionMaraton gestion = new gestionMaraton(25);

        while (true) {
            //Menu
            String menu = """
                Menu de Gestion del Maraton:
                1. Registrar nuevo participante
                2. Listar todos los participantes
                """;
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nSeleccione una opcion:"));

            //manejo del menu
            if (opcion == 1) {
                gestion.registrarParticipante();
            } else if (opcion == 2) {
                gestion.listarParticipantes();
            } else {
                JOptionPane.showMessageDialog(null, "no valida la oopcion.");

            }
