package designPatternuriCreationale.exercitiuSingletone;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static volatile ConfigManager instance;
private Properties properties;
    private ConfigManager() {
        properties = new Properties();
        try (InputStream fisier = deschideConfiguratia()) {
            if (fisier != null) {
                properties.load(fisier);
            } else {
                System.out.println("Fisierul config.properties nu a fost gasit.");
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier! " + e.getMessage());
        }
    }

    private static InputStream deschideConfiguratia() throws IOException {
        File local = new File("config.properties");
        if (local.exists()) {
            return new FileInputStream(local);
        }
        return ConfigManager.class.getResourceAsStream("config.properties");
    }

    public static ConfigManager getInstance(){
        if(instance==null){
            synchronized (ConfigManager.class){
                if(instance==null){
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public String getConfig(String key){
        return properties.getProperty(key);
    }

}
