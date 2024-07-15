public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String [17];
        String [] days = new String [7];

        //Para ver arreglos tipo matrices
        /*
        * Mexico    | CDMX
        * Perú      | Lima
        * Colombia  | Bogotá
        * Chile     | Santiago
        *
        * 4 filas, 2 columnas
        */
        String [] [] cities = new String [4][2]; // 4*2= 8 elementos

        //Arreglo de 3 dimensiones
        int [][][] numbers = new int [2][2][2];
        int [][][][] numbres = new int [2][2][2][2];

        androidVersions [0]="Apple Pie";
        androidVersions [1]="Banana bread";
        androidVersions [2]="Cupcake";
        androidVersions [3]="Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();
        System.out.println();

        cities [0][0] ="Chile";
        cities [0][1] ="Santiago";
        cities [1][0]="Colombia";
        cities [1][1]="Bogota";
        cities [2][0]="Peru";
        cities [2][1]="Lima";
        cities [3][0]="Mexico";
        cities [3][1]="CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        System.out.println();
        System.out.println();

        String [][][][] animals = new String [2][3][2][2];
        animals [1][0][0][1] ="Monkey";

        System.out.println(animals[1][0][0][1]);
    }
}
