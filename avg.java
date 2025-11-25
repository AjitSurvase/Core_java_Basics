public class avg {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int sum=0;

        for(int i:arr)
    {
        sum=sum+i;

    }
    double avg=sum/arr.length;
        System.out.println(sum);   //15
        System.out.println(avg);   //3.0
}



}
