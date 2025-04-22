package ChainOfResponsibility;

public enum Denomination {
    THOUSAND(1000),
    FIVE_HUNDRED(500),
    HUNDRED(100);

    private final int value;
    Denomination(int val){
        this.value=val;
    };

    public int getValue() {
        return value;
    }
}
