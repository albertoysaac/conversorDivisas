import javax.swing.JOptionPane;

public class Conversor_ChallengeONE {
    
    public static void main(String[] args) {
        
        String[] opciones = {"Conversor de Divisas", "Conversor de Temperatura"};
 
        boolean continuar = true;
        
        //Ciclo do-while, para regresar al menu principal al finalizar la conversion
        
        do {
            
            // Mostrar el menú principal
            
            String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un conversor:",
                "Menú Principal",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            
        // Validar la selección y llamar al conversor adecuado
            
            if (seleccion != null) {
                if (seleccion.equals("Conversor de Divisas")) {
                    convertirDivisas();
                }
                else if (seleccion.equals("Conversor de Temperatura")) {
                    convertirTemperatura();
                }
            }
            
            // Menu para saber si el cliente desea continuar usando el programa
            // en caso afirmativo entrara nuevamente al ciclo do-while
            // en caso negativo finalizara el programa
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Fin del programa. ¡Gracias por usar el conversor de divisas!");
            }
        } while (continuar);
    }

   

    public static void convertirDivisas() {
        double cantidadDivisaOrigen = 0;
        boolean esNumeroValido = false;

        //manejo de errores en la candidad ingresada por el usuario        
        
        do {
            try {
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad (solo acepta cifras cerradas o con punto decimal):");
                cantidadDivisaOrigen = Double.parseDouble(cantidadStr);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!esNumeroValido);

        // Tipos de cambio actualizados (al 18 de julio de 2023)
        double tipoCambioDolar = 16.75; // 1 USD = 16.75 MXN
        double tipoCambioEuro = 18.82; // 1 EUR = 18.82 MXN
        double tipoCambioLibraEsterlina = 21.82; // 1 GBP = 21.82 MXN
        double tipoCambioYen = 0.12; // 1 JPY = 0.12 MXN
        double tipoCambioWon = 0.013; // 1 KRW = 0.013 MXN

        String[] opcionesConversion = {
            "De Peso (MXN) a Otras Divisas",
            "De Otras Divisas a Peso (MXN)"
        };
        
        String[] opcionesDivisas = {
            "Dólares (USD)", 
            "Euros (EUR)", 
            "Libra Esterlina (GBP)",
            "Yen Japonés (JPY)",
            "Won Surcoreano (KRW)"
        };
        
        // Mostrar menú de opciones para seleccionar dirección de conversión

        String seleccionConversion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la dirección de conversión:",
                "Conversor de Divisas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcionesConversion,
                opcionesConversion[0]
        );

        double resultado = 0;
        
        if (seleccionConversion != null) {
            
            // Seleccion de divisa de destino
            
            if (seleccionConversion.equals("De Peso (MXN) a Otras Divisas")) {
                // Mostrar menú de opciones para seleccionar la moneda de destino
                
                
                // Mostrar divisas disponibles 
                
                String monedaDestino = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione la moneda a la que desea convertir:",
                        "Conversor de Divisas",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesDivisas,
                        opcionesDivisas[0]
                );

                // calculo de conversion de divisa, segun la divisa seleccionada

                if (monedaDestino != null) {
                    
                    switch (monedaDestino) {
                        case "Dólares (USD)":
                            resultado = cantidadDivisaOrigen / tipoCambioDolar;
                            break;
                        case "Euros (EUR)":
                            resultado = cantidadDivisaOrigen / tipoCambioEuro;
                            break;
                        case "Libra Esterlina (GBP)":
                            resultado = cantidadDivisaOrigen / tipoCambioLibraEsterlina;
                            break;
                        case "Yen Japonés (JPY)":
                            resultado = cantidadDivisaOrigen / tipoCambioYen;
                            break;
                        case "Won Surcoreano (KRW)":
                            resultado = cantidadDivisaOrigen / tipoCambioWon;
                            break;
                        default:
                            break;
                    }

                    //Mostrar el resultado de la conversion
                    
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " " + monedaDestino);
                }
                
                
            } else if (seleccionConversion.equals("De Otras Divisas a Peso (MXN)")) {
                
                // Mostrar menú de opciones para seleccionar la moneda de origen
                
                String monedaOrigen = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione la moneda de origen:",
                        "Conversor de Divisas",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesDivisas,
                        opcionesDivisas[0]
                );
                
                // calculo de conversion de divisa, segun la divisa seleccionada

                if (monedaOrigen != null) {
                    
                    switch (monedaOrigen) {
                        case "Dólares (USD)":
                            resultado = cantidadDivisaOrigen * tipoCambioDolar;
                            break;
                        case "Euros (EUR)":
                            resultado = cantidadDivisaOrigen * tipoCambioEuro;
                            break;
                        case "Libra Esterlina (GBP)":
                            resultado = cantidadDivisaOrigen * tipoCambioLibraEsterlina;
                            break;
                        case "Yen Japonés (JPY)":
                            resultado = cantidadDivisaOrigen * tipoCambioYen;
                            break;
                        case "Won Surcoreano (KRW)":
                            resultado = cantidadDivisaOrigen * tipoCambioWon;
                            break;
                        default:
                            break;
                    }
                    
                    //Mostrar el resultado de la conversion
                    
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " MXN");
                }
            }
        }
    }

public static void convertirTemperatura() {
    double temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius:"));

    // Fórmula de conversión de grados Celsius a Fahrenheit
    double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

    JOptionPane.showMessageDialog(null, "Temperatura en Fahrenheit: " + temperaturaFahrenheit + " °F");
}


}