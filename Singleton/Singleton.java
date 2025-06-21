public class Singleton {
    private static Singleton instance;
    private String secretMessage;
    private Singleton() {
        this.secretMessage = "thisismysecretmessage";
    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();

        }
        return instance;

    }
}
