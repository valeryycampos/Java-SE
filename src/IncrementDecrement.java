public class IncrementDecrement {
    public static void main(String[] args) {
        int lives =5;
        lives=lives-1;
        System.out.println(lives);

        //Posfija
        lives--; //Decremento
        System.out.println(lives);

        lives++; //Incremento
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift=100 + lives++;
        System.out.println(gift);//
    }
}
