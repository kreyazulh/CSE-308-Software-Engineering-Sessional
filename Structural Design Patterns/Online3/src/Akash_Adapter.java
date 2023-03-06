public class Akash_Adapter implements Local{

    PayFren payFren;
    public Akash_Adapter(PayFren payFren)
    {
        this.payFren=payFren;
    }
    @Override
    public int nid_no(int i) {
        return payFren.number(i);
    }

    @Override
    public float taka_deposit(float i) {
        return payFren.deposit((float) (i*100));
    }

    @Override
    public float taka_send(float i) {
        return i*100;
    }
}
