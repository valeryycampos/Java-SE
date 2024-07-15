public class WhileLoop {
    static boolean isTurnOnLight=false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i=1;
        while (isTurnOnLight && i<=10){
            printSOS();
        }

    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight(){

        isTurnOnLight= (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }

    //TipoVehiculo = (NumRuedas>2)? "Auto" : "Moto";
}
