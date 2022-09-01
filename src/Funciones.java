public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        double area = circuleArea(y);
        System.out.println(area);

        //Area de una esfera : 4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera: (4/3)*PI*r3
        System.out.println(sphereVolumen(y));


        System.out.println("Pesos a Dolares: " + convertoDollar(200, "MXN"));
        System.out.println("Pesos a Dolares: " + convertoDollar(1000, "COP"));

    }

    /**
     * Descripción: Calcular el área de un circulo
     * @param r Es la medida del radio del circulo
     * @return Devuelve el área del circulo dada la ecuación para lograrlo, se utiliza la Clase Math para esto
     */
    public static double circuleArea(double r){
        return Math.PI* Math.pow(r,2);
    }

    /**
     * Descripción: Calcular el área de la esfera
     * @param r Es la medida del radio de la esfera
     * @return Devuelve el área de la esfera dada la ecuación para lograrlo, se utiliza la clase Math para esto
     */
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    /**
     * Descripción: Calcular el vólumen de la esfera
     * @param r Es la mediada del radio de la esfera
     * @return Devuelve el vólumen de la esfera dada la ecuación para lograrlo, se utiliza la clase Math para esto
     */
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripción: Esta función que especificando su moneda convierte una cantidad de dinero a dollares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda Solo está validado para MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double convertoDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.049;
                break;

            case "COP":
                quantity = quantity * 0.00023;
                break;
        }
        return quantity;
    }
}
