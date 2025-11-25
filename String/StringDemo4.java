package String;

public class StringDemo4 {
    public static void main(String[] args) {

        String s = "jspider";
        System.out.println(s);

        char[] data = s.toCharArray();
        for (int a = 0; a < data.length; a++) {
            System.out.println(data[a]);
        }

        System.out.println("=========================");
        for (int a = data.length - 1; a >= 0; a--) {
            System.out.print(data[a]);
        }


    }
}
