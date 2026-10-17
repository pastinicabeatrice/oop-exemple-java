package oop.polimorfism;

public class Main {
    public static void main(String[] args){
        Vehicul v = new Vehicul();
        v.porneste();

        Vehicul v1= new Masina();
        v1.porneste();
        Vehicul v2 =  new Bicicleta();
        v2.porneste();

        Calculator c = new Calculator();
        System.out.println(c.aduna(3,5));
        System.out.println(c.aduna(3,4.5));
        System.out.println(c.aduna(3,5,1));

        Operatii o = new Operatii();
        System.out.println(o.inmulteste(2,4));
        System.out.println(o.inmulteste(3.5, 4.4));
        System.out.println(o.inmulteste(2,6,8));
    }
}
