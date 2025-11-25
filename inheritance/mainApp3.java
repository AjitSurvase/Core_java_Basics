
//heirachical inheriatnce
package inheritance;

public class mainApp3 {
    public static void main(String[] args) {
        permanentEmployee p1=new permanentEmployee();
        p1.details(101,35000);
        p1.displayDesignation("HR");

        System.out.println("========================");

        contractEmployee c1=new contractEmployee();
        c1.details(102,30000);
        c1.displayContractDetails(3);
    }
}
