package objectArray;

public class car extends vehicle{
    String company;
    static int count=0;
    public car(String comapny){
        this.company=company;
        count++;
    }

    @Override
    void getName() {
        System.out.println("company:"+company);

    }
}
