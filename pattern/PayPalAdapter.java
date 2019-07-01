package pattern;

public class PayPalAdapter implements PaymentAdapter {
    private final PayPalAccount payPalAccount;

    public PayPalAdapter(PayPalAccount payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    @Override
    public boolean collectMoney(Integer amount) {
        return this.payPalAccount.transfer(payPalAccount.getEmail(),amount).equals("Paypal Success!");
    }
}
