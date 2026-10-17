package designPatternuriCreationale.exercitiuSingletone;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static volatile Logger instance;

    private Logger(){
    }

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance=new Logger();
                }
            }
        }
        return instance;
    }

    public void logMessage(String mesaj){
        System.out.println("LOG: "+mesaj);
        try(FileWriter writer = new FileWriter ("log.txt", true)){
            writer.write("LOG: "+mesaj+" \n");
        } catch (IOException e){
            System.out.println("Eroare la scrierea in fisier!"+ e.getMessage());
        }
    }

}
