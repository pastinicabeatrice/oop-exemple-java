package designPatternuriCreationale.Singletone;

public class Logger {
    private static Logger instance;

    private Logger(){};

    public static Logger getInstance(){
        if(instance==null){
            synchronized (SingletoneLazyInitialization.class){
                if(instance==null){
            instance=new Logger();
                }
            }
        }
        return instance;
    }
}
