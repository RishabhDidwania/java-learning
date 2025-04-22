package ChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        Denomination100Handler dh_100 = new Denomination100Handler(10, null) ;
        Denomination500Handler dh_500 = new Denomination500Handler(2, dh_100);
        Denomination1000Handler dh_1000 = new Denomination1000Handler(    2, dh_500);



        dh_1000.handleTransaction(1000);

    }
}
