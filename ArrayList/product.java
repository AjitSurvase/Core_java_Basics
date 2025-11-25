package ArrayList;

public class product {
    int productId;
    String productName;
    double productPrice;
    //constructor

    public product(int productId,String productName, double productPrice) {
        this.productId = productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    @Override
    public String toString() {
        return productId+"\t"+productName+"\t"+productPrice;
    }
}



