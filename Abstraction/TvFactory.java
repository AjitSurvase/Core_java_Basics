package Abstraction;
// factory design pattern
// factory class or helper class

public class TvFactory {
    Tv purchesTv(int choice){
        Tv t1=null;

        if(choice==1){
            t1=new SamsungTv();  //upcasting

        }
        else if(choice==2){
            t1=new SonyTv();   //upcasting
        }
        return t1;
    }
}
