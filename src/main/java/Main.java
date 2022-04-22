public class Main {

    public static void main(String[] args) {
        ConnessioneDatabase conn= ConnessioneDatabase.getInstance();
        conn.stampa();
        conn=ConnessioneDatabase.getInstance();
        conn.stampa();
    }
}
