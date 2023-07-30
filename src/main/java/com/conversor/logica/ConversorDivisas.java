/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.logica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConversorDivisas {
    private HashMap<String, Double> tasasDeCambio;
    

    public ConversorDivisas() {
        initDivisas();
    }

    private void initDivisas() {
        tasasDeCambio = new HashMap<>();

        // Definir las tasas de cambio
        tasasDeCambio.put("USD-MXN", 16.75);
        tasasDeCambio.put("USD-EUR", 0.91);
        tasasDeCambio.put("USD-GBP", 0.78);
        tasasDeCambio.put("USD-JPY", 141.15);
        tasasDeCambio.put("USD-KRW", 1273.38);

        // Agregar las tasas de cambio inversas (todas las demás divisas a USD)
        tasasDeCambio.put("MXN-USD", 1 / 16.75);
        tasasDeCambio.put("EUR-USD", 1 / 0.91);
        tasasDeCambio.put("GBP-USD", 1 / 0.78);
        tasasDeCambio.put("JPY-USD", 1 / 141.15);
        tasasDeCambio.put("KRW-USD", 1 / 1273.38);

        // Agregar tasas de cambio entre otras combinaciones de divisas
        tasasDeCambio.put("EUR-MXN", 18.82);
        tasasDeCambio.put("GBP-MXN", 21.82);
        tasasDeCambio.put("JPY-MXN", 0.12);
        tasasDeCambio.put("KRW-MXN", 0.013);

        tasasDeCambio.put("MXN-EUR", 1 / 18.82);
        tasasDeCambio.put("MXN-GBP", 1 / 21.82);
        tasasDeCambio.put("MXN-JPY", 1 / 0.12);
        tasasDeCambio.put("MXN-KRW", 1 / 0.013);
    }

    public ArrayList<String> getDivisasDisponibles() {
        // Retorna la lista de divisas disponibles, por ejemplo, ["USD", "EUR", "GBP", "JPY", "KRW", ...]
        ArrayList<String> divisas = new ArrayList<>(Arrays.asList("MXN","USD", "EUR", "GBP", "JPY", "KRW"));
        return divisas;
    }

    public double calcularConversion(double cantidad, String divisaOrigen, String divisaDestino) {
        // Aquí implementamos la lógica para calcular la conversión de divisas

        // Creamos la clave para buscar el factor de conversión en el HashMap
        String clave = divisaOrigen + "-" + divisaDestino;
        double factorConversion = tasasDeCambio.getOrDefault(clave, 1.0);

        // Si la clave no existe en el HashMap, asumimos que la divisa de origen es igual a la divisa destino (factor 1)
        double resultado = cantidad * factorConversion;
        
        return resultado;
    }
}

