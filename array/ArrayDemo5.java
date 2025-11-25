package array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        char[] data ={'J','A','V','A','S','Q','L'};

        for(int a=0;a<data.length;a++)
        {
            System.out.println(data[a]);

        }
        System.out.println("============");

        for(int a=data.length-1;a>=0;a--)
        {
            System.out.println(data[a]);
        }

    }
}
