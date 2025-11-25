package objectArray;

public class bike extends vehicle {
    String company;
    static int count = 0;

    public bike(String comapny) {
        this.company = company;
        count++;
    }

    @Override
    void getName() {
        System.out.println("comapny:"+company);

    }
}