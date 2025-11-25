package String;

public class split {
    public static void main(String[] args) {
        String s="aabbcc";
        System.out.println(s);

        String[] arr1=s.split("2");
        for(int a=0; a< arr1.length;a++)
        {
            System.out.println(arr1[a]);
        }

    }
}
