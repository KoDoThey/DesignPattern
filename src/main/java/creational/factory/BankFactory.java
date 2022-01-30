package creational.factory;

public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType){
            case TPB:
                return new TPB();
            case VPB:
                return new VPB();
            default:
                throw new IllegalArgumentException("This bank is not support!");
        }
    }
}
