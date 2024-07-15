import org.w3c.dom.ls.LSOutput;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModelSelect="Dark";

        switch (colorModelSelect) {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default: //Si ninguna opcion es correcta
                System.out.println("Selecciona una opcion");
        }
    }

}
