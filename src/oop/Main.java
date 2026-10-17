package oop;

public class Main {
    public static void main(String[] args){
        Masina bmw = new Masina();
        bmw.model="BMW X5";
        bmw.viteza=250;
        bmw.porneste();

        Telefon t= new Telefon("Samsung", 'S', 170000, "Emag", 256);
        t.afiseazaDetalii();

        ContBancar c =new ContBancar(0);
        c.depuneBani(1000);
        System.out.println("Sold actual: "+c.getSold());
        c.retrageBani(700);
        System.out.println("Sold actual: "+c.getSold());
        c.retrageBani(9000);
        System.out.println("Sold actual: "+c.getSold());

        Student s =new Student("Popescu", 9);
        s.introduNota(10);
        System.out.println("Studentul "+ s.getNume()+" a obtinut nota "+ s.getNota());

   Caine sleepy = new Caine();
   sleepy.faceSunet();
   sleepy.latra();

   Pisica fify = new Pisica();
   fify.faceSunet();
   fify.miau();

   Hamster h = new Hamster();
   h.faceSunet();
    }
}
