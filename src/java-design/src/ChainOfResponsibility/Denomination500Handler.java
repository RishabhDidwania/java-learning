package ChainOfResponsibility;

import static ChainOfResponsibility.Denomination.FIVE_HUNDRED;

public class Denomination500Handler extends AtmTransactionHandler{
    int availableNotes;

    Denomination500Handler(int count, AtmTransactionHandler atmTransactionHandler){
        super(atmTransactionHandler);
        this.availableNotes=count;
    }

    @Override
    public void handleTransaction(int amt){
        if(amt % FIVE_HUNDRED.getValue() ==0){
            System.out.println(this.getClass()+"   Dispensing amount  ");
        }else {
            this.nextHandler.handleTransaction(amt);
        }
    }
}
