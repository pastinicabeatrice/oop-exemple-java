package designPatternuriCreationale.Singletone;

public class SingletoneLazyInitialization {
    private static SingletoneLazyInitialization instance;

    private SingletoneLazyInitialization(){
    }

    public static SingletoneLazyInitialization getInstance(){
        if(instance == null){
            instance=new SingletoneLazyInitialization();
        }
        return instance;
    }

}
