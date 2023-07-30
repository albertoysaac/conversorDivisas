/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.logica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alber
 */
public class ConversorTemperatura {
    
    public ConversorTemperatura() {
        
    }
    
    public ArrayList<String> getUnidadesTemperatura() {
        // Retorna la lista de unidades de temperatura disponibles, por ejemplo, ["Celsius", "Fahrenheit", "Kelvin", ...]
        ArrayList<String> unidadesTemperatura = new ArrayList<>(Arrays.asList("Celsius", "Fahrenheit", "Kelvin"));
        return unidadesTemperatura;
    }
    
    public double calcularConversion(double cantidad, String unidadOrigen, String unidadDestino) {
        // Implementa aquí la lógica para calcular la conversión de temperatura
        // Puedes usar condicionales para verificar las unidades de origen y destino y aplicar la fórmula de conversión adecuada
        // Por ejemplo:
        if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Fahrenheit")) {
            return (cantidad * 9 / 5) + 32;
        } else if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Kelvin")) {
            return cantidad + 273.15;
        } else if (unidadOrigen.equals("Fahrenheit") && unidadDestino.equals("Celsius")) {
            return (cantidad - 32) * 5 / 9;
        } else if (unidadOrigen.equals("Fahrenheit") && unidadDestino.equals("Kelvin")) {
            return (cantidad - 32) * 5 / 9 + 273.15;
        } else if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Celsius")) {
            return cantidad - 273.15;
        } else if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Fahrenheit")) {
            return (cantidad - 273.15) * 9 / 5 + 32;
        } else {
            // Si las unidades de origen y destino son iguales, simplemente retorna la cantidad sin hacer ninguna conversión
            return cantidad;
        }
    }
}
