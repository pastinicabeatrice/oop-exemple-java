import basicStuf.program1;

public class Main {
    public static void main(String[] args) {

        program1 p =new program1("Bee", "pictura", 22);
        System.out.println(p);
       float media =  p.calculeazaMedia(5,8);
       System.out.println(media);

    }
}