package ChainOfResponsibility;

import static ChainOfResponsibility.Denomination.HUNDRED;


import static ChainOfResponsibility.Denomination.FIVE_HUNDRED;

public class Denomination100Handler extends AtmTransactionHandler{
    int availableNotes;

    Denomination100Handler(int count, AtmTransactionHandler atmTransactionHandler){
        super(atmTransactionHandler);
        this.availableNotes=count;
    }

    @Override
    public void handleTransaction(int amt){
        System.out.println("here!");
        if(amt % HUNDRED.getValue() ==0){

            System.out.println(this.getClass()+"   Dispensing amount  ");
        }else{
            System.out.println("ERROR not SUPPORTED");
        }
    }
}
