//program for overload the main method

package overloading;

public class MainApp3 {

    public static void main(String[] args) {
        System.out.println("MAIN METHOD ");
        main(25);
        main('j');
    }

    //external main  method
    public static void main(int args) {
        System.out.println("main method 2 ");

    }

    //external main method
    public static void main(char args) {
        System.out.println("main method 3");

    }
}
