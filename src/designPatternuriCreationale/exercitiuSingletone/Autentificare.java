package designPatternuriCreationale.exercitiuSingletone;

public class Autentificare {
    public boolean login(String user, String pass){
    ConfigManager config =  ConfigManager.getInstance();
    Logger logger= Logger.getInstance();

    String userCorect = config.getConfig("db.user");
    String passCorect = config.getConfig("db.password");

    logger.logMessage("Incarcare logare pentru user: "+user);

    if(user.equals(userCorect)&& pass.equals(passCorect)){
        logger.logMessage("Autentificare reusita pentru user: "+user);
        return true;
    }else{
        logger.logMessage("Eroare: Autentificare esuata! "+ user);
        return false;
    }
    }
}
