public class Main {
    public static void main(String [] args) {
        Singleton secret1 = Singleton.getInstance(); //this will actually create the object

        Singleton secret2 = Singleton.getInstance(); //this will just reusethe same one
        if(secret1 == secret2) {
            System.out.println("This proves they are the same");
        } else {
            System.out.println("This will NEVER ever be printed");
        }


        return;
    }
}
