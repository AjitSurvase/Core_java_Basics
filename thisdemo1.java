public class thisdemo1 {
    void show(thisdemo1 td )
    {
        System.out.println("iside show method");
    }

    void display()
    {
        show(this);
    }

    public static void main(String[] args) {
        thisdemo1 td=new thisdemo1();
                td.display();
    }
}
