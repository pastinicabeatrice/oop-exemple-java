package abstractie.interfete;

 interface Dispozitiv {
    void porneste();
}

class Laptop implements Dispozitiv{
    public void porneste(){
        System.out.println("Laptopul porneste apasand butonul");
    }
}

class Telefon implements Dispozitiv{
     public void porneste(){
         System.out.println("Telefonul porneste apasand butonul Power.");
     }
}
