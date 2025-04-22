package ChainOfResponsibility;

import static ChainOfResponsibility.Denomination.THOUSAND;

public class Denomination1000Handler extends AtmTransactionHandler{
    int availableNotes;

    Denomination1000Handler(int avl, AtmTransactionHandler atmTransactionHandler){
        super(atmTransactionHandler);
        this.availableNotes=avl;
    }

    @Override
    public void handleTransaction(int amount) {
        System.out.println("here!");
        System.out.println(amount);
        System.out.println(THOUSAND.getValue());
        if(amount% THOUSAND.getValue()==0){
            System.out.println(this.getClass()+"  Withdrawl done!! ");
        }else{
            this.nextHandler.handleTransaction(amount);
        }
    }
}
