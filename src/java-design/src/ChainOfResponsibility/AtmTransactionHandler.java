package ChainOfResponsibility;

public abstract class AtmTransactionHandler {
    AtmTransactionHandler nextHandler;

    AtmTransactionHandler(AtmTransactionHandler next){
        this.nextHandler=next;
    }

    public abstract void handleTransaction(int amount);

}
