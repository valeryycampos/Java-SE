public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled=false;
        int fileSended=3;

        if(isBluetoothEnabled){
            //Send files
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Porfavor enciende tu bluetooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
