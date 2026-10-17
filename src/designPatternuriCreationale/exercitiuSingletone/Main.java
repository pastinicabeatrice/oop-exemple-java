package designPatternuriCreationale.exercitiuSingletone;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        ConfigManager config = ConfigManager.getInstance();

        System.out.println("Aceeasi instanta de Logger: " + (logger == Logger.getInstance()));
        System.out.println("Aceeasi instanta de ConfigManager: " + (config == ConfigManager.getInstance()));
        System.out.println("Baza de date configurata: " + config.getConfig("db.url"));

        Autentificare autentificare = new Autentificare();
        System.out.println("Login cu parola gresita: " + autentificare.login("root", "1234"));
        System.out.println("Login cu datele corecte: " + autentificare.login("root", config.getConfig("db.password")));
    }
}
