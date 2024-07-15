public class Funciones {

    public static void main(String[] args) {
        double y=3;
        //Area de circulo
        circleArea(y);

        //Area de esfera
        sphereArea(y);

        //Volumen de esfera
        sphereVolumen(y);

        //Conversión de monedas
        System.out.println("SOLES A DOLARES: " + converToDolar(200,"PEN"));
    }


    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripción:  Función que especificando su moneda convierte una cantidad de dinero a dólares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MEN o MXM
     * @return quantity Devuelve la cantidad actualizada en dólares
     * */
    public static double converToDolar (double quantity, String currency){
        //PEN MXM
        switch (currency){
            case"PEN":
                quantity = quantity*0.27;
                break;
            case "MXM":
                quantity = quantity*0.059;
                break;
            }
            return quantity;
    }
}
