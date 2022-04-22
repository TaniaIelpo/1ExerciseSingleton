import java.util.Optional;

public class ConnessioneDatabase {

    private static ConnessioneDatabase instance;
    private static final String HOST="localhost";
    private static final String USERNAME="user";
    private static final String PASSWORD="password";
    private static final String PORT="80";


    private ConnessioneDatabase(){}

    public static ConnessioneDatabase getInstance(){
        if(!Optional.ofNullable(instance).isPresent()){
            System.out.println("Prima istanza di ConnesioneDatabase");
            instance=new ConnessioneDatabase();
        }
        return instance;
    }

    /**
     * This method prints connection information
     */

    public void stampa(){
        /*System.out.println("Host: "+HOST+
                "\nUsername: "+USERNAME+
                "\nPassword: "+PASSWORD+
                "\nPorta: "+PORT);*/
        System.out.println("Host: "+this.getHost()+
                "\nUsername: "+this.getUsername()+
                "\nPassword: "+this.getPassword()+
                "\nPorta: "+this.getPort());
    }

    public String getHost() {
        return HOST;
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public String getPort() {
        return PORT;
    }

}