public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuántos perritos ubiqué al mes

        double monthlyDogs=30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs=(int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a=30;
        int b=12;
        System.out.println((double)a/b);

        double c=a/b;
        System.out.println(c);

        char n='1';
        int nI=n;
        System.out.println(nI); //sale 49 por ASCII alt+49=1
    }
}
