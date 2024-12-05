
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author issac
 */
public class participante {

    private String nombre;
    private int edad;
    private int numeroCorredor;
    private double tiempoEstimado;
    private String categoria;

    //Constructor
    public participante(String nombre, int edad, int numeroCorredor, double tiempoEstimado) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
        this.categoria = calcularCategoria();
    }

    //metodo para calcular la categoría
    private String calcularCategoria() {
        if (edad < 18) {
            return "Juvenil";
        } else if (edad <= 40) {
            return "Adulto";
        } else {
            return "Master";
        }
    }

    //metodo para obtener detalles del participante
    public String obtenerDetalles() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nNumero de Corredor: " + numeroCorredor
                + "\nTiempo Estimado: " + tiempoEstimado + " minutos\nCategoría: " + categoria;

    }
}
