package class3;

import java.util.Objects;

public class ATM {


    public static final String FIFTY = "fifty";
    public static final String TWENTY = "twenty";
    public static final String TEN = "ten";

    private int ten;
    private int twenty;
    private int fifty;

    public ATM(int ten, int twenty, int fifty) {
        this.ten = ten;
        this.twenty = twenty;
        this.fifty = fifty;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        if (ten >= 0) {
            this.ten = ten;
        }
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public void addMoney(int count, String nominal) {
        Objects.requireNonNull(nominal);
        switch (nominal) {
            case FIFTY:
                setFifty(getFifty() + count);
                break;
            case TEN:
                setFifty(getFifty() + count);
                break;
            case TWENTY:
                setFifty(getFifty() + count);
                break;
        }

    }

    public boolean takeMoney(int sum) {
        if (getMoneyCount() < sum) {
            return false;
        }
        int twentyCount = getTwenty() ==0 ? 0: sum / 20;
        if (twentyCount>0){
            sum%=20;
        }
        int tenCount = getTen() ==0?0:sum /10;

        int newTen = getTen() - tenCount;
        int newTwenty = getTwenty() - twentyCount;
        if (newTen < 0 || newTwenty < 0) {
            return false;
        }
        setTwenty(newTwenty);
        setTen(newTen);
        return true;
    }

    private int getMoneyCount() {
        return getTen() * 10 + getFifty() * 50 + getTwenty() *20;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "ten=" + ten +
                ", twenty=" + twenty +
                ", fifty=" + fifty +
                '}';
    }
}
