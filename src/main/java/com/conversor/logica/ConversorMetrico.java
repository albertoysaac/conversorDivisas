/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.logica;

/**
 *
 * @author alber
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConversorMetrico {
    private HashMap<String, Double> factoresConversion;

    public ConversorMetrico() {
        factoresConversion = new HashMap<>();

        // Definir los factores de conversión
        factoresConversion.put("Metros-Centímetros", 100.0);
        factoresConversion.put("Metros-Milímetros", 1000.0);
        factoresConversion.put("Metros-Pulgadas", 39.3701);
        factoresConversion.put("Metros-Pies", 3.28084);
        factoresConversion.put("Centímetros-Metros", 1 / 100.0);
        factoresConversion.put("Centímetros-Milímetros", 10.0);
        factoresConversion.put("Centímetros-Pulgadas", 0.393701);
        factoresConversion.put("Centímetros-Pies", 0.0328084);
        factoresConversion.put("Milímetros-Metros", 1 / 1000.0);
        factoresConversion.put("Milímetros-Centímetros", 1 / 10.0);
        factoresConversion.put("Milímetros-Pulgadas", 0.0393701);
        factoresConversion.put("Milímetros-Pies", 0.00328084);
        factoresConversion.put("Pulgadas-Metros", 1 / 39.3701);
        factoresConversion.put("Pulgadas-Centímetros", 1 / 0.393701);
        factoresConversion.put("Pulgadas-Milímetros", 1 / 0.0393701);
        factoresConversion.put("Pulgadas-Pies", 1 / 12.0);
        factoresConversion.put("Pies-Metros", 1 / 3.28084);
        factoresConversion.put("Pies-Centímetros", 1 / 0.0328084);
        factoresConversion.put("Pies-Milímetros", 1 / 0.00328084);
        factoresConversion.put("Pies-Pulgadas", 12.0);
    }

  

    public ArrayList<String> getUnidadesMetricas() {
        // Retorna la lista de unidades métricas disponibles
        ArrayList<String> unidades = new ArrayList<>(Arrays.asList(
                "Metros", "Centímetros", "Milímetros", "Pulgadas", "Pies"
        ));
        return unidades;
    }

    public double calcularConversion(double cantidad, String unidadOrigen, String unidadDestino) {
        // Aquí implementamos la lógica para calcular la conversión entre unidades métricas

        // Creamos la clave para buscar el factor de conversión en el HashMap
        String clave = unidadOrigen + "-" + unidadDestino;
        double factorConversion = factoresConversion.getOrDefault(clave, 1.0);

        // Si la clave no existe en el HashMap, asumimos que las unidades son iguales (factor 1)
        double resultado = cantidad * factorConversion;

        return resultado;
    }
}

